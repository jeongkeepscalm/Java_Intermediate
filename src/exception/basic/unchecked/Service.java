package exception.basic.unchecked;


public class Service {

  Client client = new Client();

  public void callCatch() {
    try {
      client.call();
    } catch (MyUncheckedException e) {
      System.out.println("예외처리, message= "+ e.getMessage());
    }
    System.out.println("unchecked 예외처리 후 정상흐름");
  }

  // uncheckedException: 예외를 잡지 않아도 되며 자연스럽게 상위로 예외를 던진다.
  public void callThrow() {
    client.call();
  }

}
