package exception.ex4.exception;


public class ConnectExceptionV4 extends NetworkClientExceptionV4 {

  // 서버의 주소를 넣어둔다.
  private final String address;

  public ConnectExceptionV4(String address, String message) {
    super(message);
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

}
