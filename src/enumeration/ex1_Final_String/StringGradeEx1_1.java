package enumeration.ex1_Final_String;

public class StringGradeEx1_1 {
    public static void main(String[] args) {

        int price = 10000;
        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);
        int vip = discountService.discount("vip", price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
        System.out.println("vip 등급의 할인 금액: " + vip);

        /**
         * 매개변수를 문자열 상수로 사용하였지만 여전히 매개변수를 문자열로 받고 있어,
         * 다른 문자열 기입을 막을 수는 없다.
         * => 지정한 값 외의 값이 매개변수로 들어갈 수 있다.
         * **/
    }
}
