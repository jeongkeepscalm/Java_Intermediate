package nested.nested;


public class NestedOuter {

  private static int a = 3; // static / 클래스 변수
  private int b = 2; // 인스턴스 변수

  static class Nested {

    private int c = 1;

    public void print() {
      System.out.println(c);
      // System.out.println(b); static 클래스이므로 인스턴스 변수에 접근이 불가능하다.
      System.out.println(a);
    }
  }

}
