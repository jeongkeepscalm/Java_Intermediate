package nested.nested.local;

public class LocalOuterV1 {

  private int a = 3;

  public void process(int param) {

    int b = 2;

    class LocalPrinter {

      int c = 1;

      public void localPrint() {
        System.out.println("a = " + a); // 3
        System.out.println("b = " + b); // 2
        System.out.println("c = " + c); // 1
        System.out.println("param = " + param); // 100
      }

    }

    LocalPrinter localPrinter = new LocalPrinter();
    localPrinter.localPrint();

  }

  public static void main(String[] args) {
    LocalOuterV1 localOuterV1 = new LocalOuterV1();
    localOuterV1.process(100);
  }

}
