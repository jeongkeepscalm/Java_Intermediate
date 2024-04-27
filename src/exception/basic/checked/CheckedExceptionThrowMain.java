package exception.basic.checked;

public class CheckedExceptionThrowMain {

  public static void main(String[] args) throws MyCheckedException {

    Service service = new Service();
    service.callThrow(); // 컴파일 오류.
    System.out.println("정상 종료"); // 출력 x

    /**
     * 예외가 밖으로 던져지면 예외 정보와 Stack Trace 를 출력하고 프로그램이 종료된다.
     * StackTrace: 예외가 어디서 발생했는지, 어떤 경로를 거쳐서 넘어왔는지 확인할 수 있다.
     */
  }

}
