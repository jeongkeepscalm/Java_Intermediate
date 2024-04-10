package lang.string.chaining;

public class MethodChainingMain {
  public static void main(String[] args) {

    /**
     * 메소드 체이닝
     * 코드를 간결하고 읽기 쉽게 만들어준다.
     * 생성한 인스턴스(자기 자시의 참조값)를 반환하기 때문에 가능하다.
     * **/
    ValueAdder adder = new ValueAdder();
    int value = adder.add(1).add(2).add(3).getValue();
    System.out.println(value); // 6
  }
}
