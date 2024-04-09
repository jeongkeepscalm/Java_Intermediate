package lang.string;

public class Methods {
  public static void main(String[] args) {

    int num = 100;
    boolean bool = true;
    String str = "Hello, Java!";
    String msg = "Hello, Java! Welcome to Java world.";

    System.out.println("java".equalsIgnoreCase("JAVA")); // ture

    System.out.println(" ".isBlank()); // true
    System.out.println(msg.contains("world")); // true

    System.out.println(msg.startsWith("world")); // false
    System.out.println(msg.endsWith("world.")); // true

    System.out.println(msg.indexOf("Java", 10)); // 24: 10 인덱스 이 후부터 찾는다.
    System.out.println(msg.lastIndexOf("Java")); // 24

    // join()
    String fruits = "apple,orange,banana";
    String[] split = fruits.split(",");
    System.out.println(String.join("-", "a", "b", "c")); // a-b-c
    System.out.println(String.join("-", split)); // apple-orange-banana

    // format()
    System.out.println(String.format("num : %d, bool : %b, str : %s", num, bool, str)); // num : 100, bool : true, str : Hello, Java!
    System.out.println(String.format("%.2f", 10.1234)); // 10.12

    // matches()
    String regex = "Hello, (Java!|World)";
    System.out.println(str.matches(regex)); // true

  }

}
