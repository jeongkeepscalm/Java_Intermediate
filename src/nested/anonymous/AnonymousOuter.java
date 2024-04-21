package nested.anonymous;

import nested.nested.local.Printer;

public class AnonymousOuter {

  private int a = 3;

  public void process(int param) {

    int b = 2;

    /** 익명클래스: 클래스의 선언과 생성을 동시에 한다. **/
    Printer printer = new Printer() {

      int c = 1;

      @Override
      public void print() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("param = " + param);
      }

    };

    printer.print();

  }

  public static void main(String[] args) {
    AnonymousOuter anonymousOuter = new AnonymousOuter();
    anonymousOuter.process(100);
  }

}
