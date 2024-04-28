package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

  public void sendMessage(String data) {

    String address = "https://example.com";
    NetworkClientV3 client = new NetworkClientV3(address);

    client.initError(data);

    /**
     * 심각도: 연결오류 > 전송오류 > 그 외
     */
    try {
      client.connect();
      client.send(data);
    } catch (ConnectExceptionV3 e) {
      System.out.println("[연결 오류] address: " + e.getAddress() + ", message: " + e.getMessage());
    } catch (NetworkClientExceptionV3 e) {
      System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
    } finally {
      client.disconnect();
    }

  }

}
