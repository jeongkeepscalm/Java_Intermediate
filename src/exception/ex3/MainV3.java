package exception.ex3;

import java.util.Scanner;

public class MainV3 {

  public static void main(String[] args) {

//    NetworkServiceV3_1 service = new NetworkServiceV3_1();
    NetworkServiceV3_2 service = new NetworkServiceV3_2();

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("전송할 문자: ");
      String input = scanner.nextLine();
      if (input.equals("exit")) {
        break;
      }
      service.sendMessage(input);
      System.out.println();
    }

    System.out.println("프로그램을 종료합니다.");

  }

}
