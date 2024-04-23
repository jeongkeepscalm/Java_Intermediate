package exception.ex1;


public class NetworkServiceV1_3 {

  public void sendMessage(String data) {

    String address = "https://example.com";
    NetworkClientV1 client = new NetworkClientV1(address);

    client.initError(data);

    /**
     정상 흐름과 예외 흐름이 분리되지 않아 가독성이 떨어진다.
     반환코드를 받아서 처리를 하는 순간 정상흐름과 예외흐름이 섞인다.
     => 반환값을 활용하여 예외처리하지 말자.
     **/
    String connectResult = client.connect();
    if (isError(connectResult)) {
      System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
    } else {
      String sendResult = client.send(data);
      if (isError(sendResult)) {
        System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
      }
    }

    client.disconnect();

  }

  private static boolean isError(String connectResult) {
    return !connectResult.equals("success");
  }


}
