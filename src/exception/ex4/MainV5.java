package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV5 {

  public static void main(String[] args) {

    NetworkServiceV5 service = new NetworkServiceV5();

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("전송할 문자: ");
      String input = scanner.nextLine();
      if (input.equals("exit")) {
        break;
      }

      try {
        service.sendMessage(input);
      } catch (Exception e) {
        exceptionHandler(e);
      }

      System.out.println();
    }

    System.out.println("프로그램을 종료합니다.");

  }

  // 공통 예외 처리
  private static void exceptionHandler(Exception e) {

    // 공통 처리
    System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다."); // 사용자용: html 에 출력된다 가정
    System.out.println("==개발자용 디버깅 메시지=="); // 개발자용: 파일로 남겨지는 내용으로 가정

    e.printStackTrace(System.out); // 스택 트레이스 출력
    // e.printStackTrace(System.err);

    // 필요하면 예외 별로 별도의 추가 처리 가능
    if (e instanceof SendExceptionV4 sendEx) {
      System.out.println("[전송 오류] 전송 데이터: "+ sendEx.getSendData());
    }

  }

  /**
   * e.printStackTrace(System.out); vs e.printStackTrace(System.err); || e.printStackTrace();
   * out 과 err 의 흐름이 달라서 출력 순서가 달라질 수 있음. (코드 실행 시 의도된 순서대로 콘솔에 찍히게 하기 위해 System.out 사용)
   * 일반적으로 e.printStackTrace() 쓰면 됨.
   *
   * 실무에서는 Slf4J, logback 같은 별도의 로그 라이브러리를 사용해서 콘솔과 특정 파일에 함께 결과를 출력한다.
   * 그런데, e.printStackTrace() 를 직접 호출하면 결과가 콘솔에만 출력되어 서버에서 로그를 확인하기 어렵다.
   */

}
