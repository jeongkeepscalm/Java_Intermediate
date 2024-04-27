package exception.ex2;

public class NetworkClientV2 {

  private String address;

  public boolean connectError;
  public boolean sendError;

  public NetworkClientV2(String address) {
    this.address = address;
  }

  public void connect() throws NetworkClientExceptionV2{
    if (connectError) {
      throw new NetworkClientExceptionV2("connectError", address+ " 서버 연결 실패");
    }
    System.out.println(address + " 서버 연결 성공");
  }

  public void send(String data) throws NetworkClientExceptionV2{
    if (sendError) {
      throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패: " + data);

      // 중간에 NetworkClientExceptionV2 예외가 아닌 다른 예외가 발생했다 가정할 때,
      // throw new RuntimeException("RuntimeException Message");
    }
    System.out.println(address + " 서버에 데이터 전송: " + data);
  }

  public void disconnect() {
    System.out.println(address + " 서버 연결 해제");
  }

  public void initError(String data) {
    if (data.contains("error1")) {
      connectError = true;
    }
    if (data.contains("error2")) {
      sendError = true;
    }
  }
}
