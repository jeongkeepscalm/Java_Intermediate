package lang.string.test;

public class CountMethod {
  public static void main(String[] args) {
    
    // str 에서 key 로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
    String str = "start hello java, hello spring, hello jpa";
    String key = "hello";

    int count = 0;
    int index = str.indexOf(key);

    while (index >= 0) {
      index = str.indexOf(key, index + 1);
      count++;
    }

    System.out.println(count);

  }
}
