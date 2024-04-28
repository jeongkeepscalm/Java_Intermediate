package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

  public void sendMessage(String data) {

    String address = "https://example.com";
    NetworkClientV3 client = new NetworkClientV3(address);

    client.initError(data);

    /**
     * try: 정상흐름 코드
     * catch: 예외흐름 코드
     */
    try {
      client.connect();
      client.send(data);
    } catch (ConnectExceptionV3 e) {
      System.out.println("[연결 오류] address: " + e.getAddress() + ", message: " + e.getMessage());
    } catch (SendExceptionV3 e) {
      System.out.println("[전송 오류] data: " + e.getSendData() + ", message: " + e.getMessage());
    } finally {
      client.disconnect();
    }

  }

}
