package exception.ex1;


import exception.ex1.NetworkClientV1;

public class NetworkServiceV1_2 {

  public void sendMessage(String data) {

    String address = "https://example.com";
    NetworkClientV1 client = new NetworkClientV1(address);

    client.initError(data);

    // 정상 흐름과 예외 흐름이 분리되지 않아 가독성이 떨어진다.
    String connectResult = client.connect();
    if (isError(connectResult)) {
      System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
      return;
    }
    String sendResult = client.send(data);
    if (isError(sendResult)) {
      System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
      return;
    }

    client.disconnect();

  }

  private static boolean isError(String connectResult) {
    return !connectResult.equals("success");
  }


}
