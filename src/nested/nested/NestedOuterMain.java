package nested.nested;

public class NestedOuterMain {
  public static void main(String[] args) {
    
    // 정적 중첩 클래스 접근
    NestedOuter.Nested nested = new NestedOuter.Nested();
    nested.print();
    System.out.println("nested.getClass() = " + nested.getClass());

  }

}
