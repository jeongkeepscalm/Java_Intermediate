package lang.string.test;

import java.util.Arrays;

public class JoinMethod {
  public static void main(String[] args) {
    String fruits = "apple,banana,mango";
    String[] split = fruits.split(",");
    Arrays.stream(split).forEach(v-> {
      System.out.println(v);
    });
    String join = String.join("->", split);
    System.out.println(join);
  }
}
