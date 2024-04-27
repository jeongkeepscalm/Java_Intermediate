package exception.ex2;

import java.util.Scanner;

public class MainV2 {

  public static void main(String[] args) throws NetworkClientExceptionV2{

//    NetworkServiceV2_1 service = new NetworkServiceV2_1();
//    NetworkServiceV2_2 service = new NetworkServiceV2_2();
//    NetworkServiceV2_3 service = new NetworkServiceV2_3();
//    NetworkServiceV2_4 service = new NetworkServiceV2_4();
    NetworkServiceV2_5 service = new NetworkServiceV2_5();

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
