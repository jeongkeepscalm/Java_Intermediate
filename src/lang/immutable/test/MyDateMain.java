package lang.immutable.test;

public class MyDateMain {
    public static void main(String[] args) {

        ImmutableMyDate date1 = new ImmutableMyDate(2024, 4, 8);

        ImmutableMyDate date2 = date1;

        System.out.println(date1);
        System.out.println(date2);

        ImmutableMyDate date3 = date2.withDay(10);

        System.out.println(date2);
        System.out.println(date3);
        

    }
}
