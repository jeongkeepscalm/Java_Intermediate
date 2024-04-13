package nested.inner;

public class InnerOuter {

  private static int a = 3;
  private int b = 2;

  class Inner {
    private int c = 1;

    public void print() {
      System.out.println(c);
      System.out.println(b); // 인스턴스 멤버에 접근 가능.
      System.out.println(a); // 클래스 멤버에 접근 가능.
    }
  }
}
