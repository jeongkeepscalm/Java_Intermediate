package exception.ex3.exception;

public class ConnectExceptionV3 extends NetworkClientExceptionV3 {

  // 서버의 주소를 넣어둔다.
  private final String address;

  public ConnectExceptionV3(String address, String message) {
    super(message);
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

}
