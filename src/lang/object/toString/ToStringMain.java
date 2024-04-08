package lang.object.toString;

public class ToStringMain {

    public static void main(String[] args) {

        Dog dog1 = new Dog("aaa", 3);
        Dog dog2 = new Dog("bbb", 5);

        System.out.println(dog1); // println() 내부에서 toString() 호출.
        System.out.println(dog2.toString());
        // Dog{dogName='aaa', age=3}
        // Dog{dogName='bbb', age=5}

        int i = System.identityHashCode(dog2);
        System.out.println(i); // 186370029
        String s = Integer.toHexString(i); // 16진수로 바꿔 참조값을 확인할 수 있다.
        System.out.println(s); // b1bc7ed

    }
}
