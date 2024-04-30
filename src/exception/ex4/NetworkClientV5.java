package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable {

  private String address;

  public boolean connectError;
  public boolean sendError;

  public NetworkClientV5(String address) {
    this.address = address;
  }

  public void connect(){
    if (connectError) {
      // UnChecked(RuntimeException) 이므로 throws 할 필요없다.
      throw new ConnectExceptionV4(address, " 서버 연결 실패");
    }
    System.out.println(address + " 서버 연결 성공");
  }

  public void send(String data) {
    if (sendError) {
      // UnChecked(RuntimeException) 이므로 throws 할 필요없다.
      throw new SendExceptionV4(data, address+ " 서버에 데이터 전송 실패: "+ data);
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

  /**
   * AutoCloseable 인터페이스를 구현하여 메소드 오버라이딩.
   * try 문에서 벗어날 시 바로 close() 메소드가 호출된다.
   */
  @Override
  public void close() {
    this.disconnect();
  }

}
