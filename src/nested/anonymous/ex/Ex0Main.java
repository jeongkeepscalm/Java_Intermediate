package nested.anonymous.ex;

import lang.clazz.Hello;

public class Ex0Main {

  // 코드를 리팩토링해서 코드의 중복을 제거해라.
  /*
    public static void helloJava() {
      System.out.println("프로그램 시작");
      System.out.println("Hello Java");
      System.out.println("프로그램 종료");
    }
    public static void helloSpring() {
      System.out.println("프로그램 시작");
      System.out.println("Hello Spring");
      System.out.println("프로그램 종료");
    }
  */

  public static void hello(String str) {
    System.out.println("프로그램 시작");
    System.out.println(str);
    System.out.println("프로그램 종료");
  }
  public static void main(String[] args) {
    hello("hello Java");
    hello("hello Spring");
  }

}
