package exception.ex1;

import java.util.Scanner;

public class MainV1 {

  public static void main(String[] args) {

//    NetworkServiceV1_1 service = new NetworkServiceV1_1(); // 문제점: connect() 실패 후 send() 호출
//    NetworkServiceV1_2 service = new NetworkServiceV1_2(); // 문제점: 서버 연결 후 연결을 끊지 않고 새로운 서버연결을 계속한다.
    NetworkServiceV1_3 service = new NetworkServiceV1_3();

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
