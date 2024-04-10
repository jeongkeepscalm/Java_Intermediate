package lang.string.test;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class LengthMethodWithAtomicInteger {
  public static void main(String[] args) {

    // 1.
    String[] arr = {"hello", "java", "jvm"};

    // int sum = Arrays.stream(arr).mapToInt(v -> v.length()).sum();
    AtomicInteger sum = new AtomicInteger(0);

    Arrays.stream(arr).forEach(v -> {
      sum.addAndGet(v.length());
      System.out.println(v + ":" + v.length());
    });

    System.out.println(sum);

  }

}
