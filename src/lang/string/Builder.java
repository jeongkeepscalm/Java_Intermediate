package lang.string;

public class Builder {
  public static void main(String[] args) {

    /** StringBuilder
     * 문자열끼리 합치는 것은 불변인 String 인스턴스를 매번 생성하는 것의 반복이다.
     * 이는 메모리 효율이 떨어지는 행위이므로 가변 클래스인 StringBuilder 를 사용하자.
     * => 자바 version 9 부터는 "+" 로 문자열을 더할 때 컴파일 시 내부적으로 빌더를 사용해서 문자를 더한 후 스트링으로 반환한다.
     *    단, 루프 안 문자열을 더하는 코드는 최적화가 이루어지지 않으니 이 때 StringBuilder 를 사용하자.
     **/

    StringBuilder sb = new StringBuilder();
    sb.append("a");
    sb.append("b");
    sb.append("c");
    sb.append("d");
    System.out.println(sb); // abcd

    System.out.println(sb.insert(4, "ffff")); // abcdffff

    System.out.println(sb.delete(4, 8)); // abcd

    System.out.println(sb.reverse()); // dcba

    // StringBuilder(가변) -> String(불변)
    String str = sb.toString();
    System.out.println(str);

    // 루프 안 StringBuilder 사용
    long startTime = System.currentTimeMillis();
    StringBuilder sb2 = new StringBuilder();
    for (int i = 0; i < 100000; i++) {
      sb2.append("java ");
    }
    long endTime = System.currentTimeMillis();

    System.out.println(endTime-startTime);

  }
}
