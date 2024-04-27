package exception.basic.checked;

/**
  예외 클래스를 만들려면 예외 클래스를 상속 받으면 된다.
  Exception 을 상속받은 예외는 체크 예외가 된다.
 **/
public class MyCheckedException extends Exception {

  /**
   MyCheckedException 클래스의 생성자는 Exception 클래스의 생성자를 오버로딩한다.
   자식 클래스에서 부모 클래스의 생성자를 호출하여 부모 클래스의 필드나 메소드를 초기화한다.

   부모 Exception 클래스에 메세지를 보관
    -> Throwable Class 내 String detailMessage 필드에 메시지 저장.
    -> getMessage()를 통해 조회 가능.
   **/
  public MyCheckedException(String message) {
    super(message);
  }


}
