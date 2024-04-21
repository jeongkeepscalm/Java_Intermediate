package nested.test;

public class OuterClass2 {

  // 내부 클래스
  // 여기에 InnerClass 를 구현해라. 그리고 hello() 메서드를 만들어라.
  class InnerClass {
    void hello(){
      System.out.println(this.getClass());
    }

  }
}
