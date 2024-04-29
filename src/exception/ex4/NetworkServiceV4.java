package exception.ex4;


import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.NetworkClientExceptionV4;

public class NetworkServiceV4 {

  public void sendMessage(String data) {

    String address = "https://example.com";
    NetworkClientV4 client = new NetworkClientV4(address);

    client.initError(data);

    try {
      client.connect();
      client.send(data);
    } finally {
      client.disconnect();
    }

    /**
     * 언체크 예외이므로 throws 를 사용하지 않는다.
     * NetworkClientV4 예외들은 복구할 수 없으며 해당 예외들을 생각하지 않는 것이 더 나은 선택일 수 있다.
     *
     * => 해결할 수 없는 예외들은 다른 곳에서 공통으로 처리된다.
     * 이런 방식 덕 분에 NetworkServiceV4 는 해결할 수 없는 예외보다는 본인 스스로의 코드에 더 집중할 수 있으며, 코드가 깔끔해진다.
     */

  }

}
