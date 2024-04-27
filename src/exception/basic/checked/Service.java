package exception.basic.checked;

public class Service {

  Client client = new Client();

  // 체크 예외를 잡아서 처리하는 코드
  public void callCatch() {

    try {
      client.call();
    } catch (MyCheckedException ex) {
      // 예외 처리 로직
      System.out.println("예외 처리, message= " + ex.getMessage());
    }
    System.out.println("catch 문에서 예외 처리 후 정상흐름으로 돌아온다.");

  }

  // 체크 예외를 밖으로 던지는 코드
  public void callThrow() throws MyCheckedException {
    client.call();
  }

}
