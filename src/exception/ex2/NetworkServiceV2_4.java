package exception.ex2;

public class NetworkServiceV2_4 {

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
    } catch (NetworkClientExceptionV2 e) {
      System.out.println("[오류] 코드: + " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
    }

    /**
     * 정상흐름이든 예외처리 후 흐름이든 항상 disconnect()이 호출된다.
     * 하지만 catch 에서 놓치는 오류( RuntimeException 등.. ) 발생 시,
     * 하위 client.disconnect() 는 호출되지 못한다.
     */
    client.disconnect();

  }

}
