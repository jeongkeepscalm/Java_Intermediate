package nested.test;

public class OuterClass1 {

  // 정적 중첩 클래스
  // 여기에 NestedClass를 구현해라. 그리고 hello() 메서드를 만들어라.
  static class NestedClass {
    void hello() {
      System.out.println(this.getClass());
    }
  }
}
