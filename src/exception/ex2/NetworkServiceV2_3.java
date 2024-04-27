package exception.ex2;

public class NetworkServiceV2_3 {

  public void sendMessage(String data) {

    String address = "https://example.com";
    NetworkClientV2 client = new NetworkClientV2(address);

    client.initError(data);

    /**
     * try: 정상흐름 코드
     * catch: 예외흐름 코드
     */
    try {
      client.connect();
      client.send(data);
      client.disconnect();
    } catch (NetworkClientExceptionV2 e) {
      System.out.println("[오류] 코드: + " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
    }

  }

}
