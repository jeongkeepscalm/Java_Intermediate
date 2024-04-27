package exception.basic.checked;

public class Client {

  /**
    MyCheckedException 예외가 발생하였을 경우 예외를 호출한 곳으로 던진다.
    throw: 새로운 예외를 발생시킬 수 있다.
    throws: 발생시킨 예외를 메소드 밖으로 던질 때 사용한다.
   **/
  public void call() throws MyCheckedException {

    // 문제 상황
    throw new MyCheckedException("exception message");

  }

}
