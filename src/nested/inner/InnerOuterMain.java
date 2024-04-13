package nested.inner;

public class InnerOuterMain {
  public static void main(String[] args) {

    // 인스턴스 내 내부클래스에 접근.
    InnerOuter innerOuter = new InnerOuter();
    InnerOuter.Inner inner = innerOuter.new Inner();
    inner.print();
    System.out.println("inner.getClass() = " + inner.getClass());
    // inner.getClass() = class nested.inner.InnerOuter$Inner
  }

}
