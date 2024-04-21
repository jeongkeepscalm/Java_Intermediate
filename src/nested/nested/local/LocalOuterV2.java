package nested.nested.local;

public class LocalOuterV2 {

  private int a = 3;

  public void process(int param) {

    int b = 2;

    // 인터페이스 구현해서 사용 가능하다.
    class LocalPrinter implements Printer{

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
    localPrinter.print();

  }

  public static void main(String[] args) {
    LocalOuterV2 localOuterV2 = new LocalOuterV2();
    localOuterV2.process(100);
  }

}
