package nested.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

  private int a = 3;

  public Printer process(int param) {

    int b = 2; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

    // 인터페이스 구현해서 사용 가능하다.
    class LocalPrinter implements Printer {

      int c = 1;

      @Override
      public void print() {
        System.out.println("a = " + a); // 3
        System.out.println("b = " + b); // 2
        System.out.println("c = " + c); // 1
        System.out.println("param = " + param); // 100
      }

    }

    LocalPrinter localPrinter = new LocalPrinter();
//    localPrinter.print(); V3에서는 LocalPrinter 를 반환한다.
    return localPrinter;

  }

  public static void main(String[] args) {
    LocalOuterV3 localOuterV1 = new LocalOuterV3();
    Printer printer = localOuterV1.process(100);
    printer.print();

    //추가
    System.out.println("필드 확인");
    Field[] fields = printer.getClass().getDeclaredFields();
    for (Field field : fields) {
      System.out.println("field = " + field);
    }
    /*
      field = int nested.nested.local.LocalOuterV3$1LocalPrinter.c
      field = final int nested.nested.local.LocalOuterV3$1LocalPrinter.val$b
      field = final int nested.nested.local.LocalOuterV3$1LocalPrinter.val$param
      field = final nested.nested.local.LocalOuterV3 nested.nested.local.LocalOuterV3$1LocalPrinter.this$0
    */

  }

  /**
    반환된 Printer 는 어떻게 a, b, param 에 접근이 가능했을까?
    LocalPrinter 인스턴스가 생성될 때, 지역 변수들을 확인한 후 변수의 값이 캡쳐가 되어 해당 인스턴스에 저장된다.
    즉, 인스턴스 내 캡처된 변수의 값을 바탕으로 접근이 가능하다.

    b, param 은 "사실상 final" 이다.
    해당 값을 변경 시 컴파일 오류발생.

    캡쳐변수의 값을 변경하지 못하는 이유는?
    1. 지역 변수의 값을 변경하면 인스턴스에 캡처한 변수의 값도 변경해야 한다.
    2. 반대로 인스턴스에 있는 캡처 변수의 값을 변경하면 해당 지역 변수의 값도 다시 변경해야 한다.
    3. 지역 변수의 값과 인스턴스에 있는 캡처 변수의 값을 서로 동기화 해야 하는데,
      멀티쓰레드 상황에서 이런 동기화는 매우 어렵고, 성능에 나쁜 영향을 줄 수 있다.

   **/

}
