package exception.ex2;

public class NetworkServiceV2_2 {

  public void sendMessage(String data) {

    String address = "https://example.com";
    NetworkClientV2 client = new NetworkClientV2(address);

    client.initError(data);

    // 정상흐름과 예외흐름이 섞여있어 코드를 읽기 어렵다.
    try {
      client.connect();
    } catch (NetworkClientExceptionV2 e) {
      System.out.println("[오류] 코드: + " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
      return;
    }

    // 정상흐름과 예외흐름이 섞여있어 코드를 읽기 어렵다.
    try {
      client.send(data);
    } catch (NetworkClientExceptionV2 e) {
      System.out.println("[오류] 코드: + " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
      return;
    }

    client.disconnect();

  }

}
