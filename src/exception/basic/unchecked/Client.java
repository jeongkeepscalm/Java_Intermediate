package exception.basic.unchecked;

// UncheckedException(RuntimeException)은 throws 생략이 가능하다.
public class Client {
  public void call() {
    throw new MyUncheckedException("unchecked exception");
  }
}
