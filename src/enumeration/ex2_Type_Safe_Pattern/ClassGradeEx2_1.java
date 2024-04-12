package enumeration.ex2_Type_Safe_Pattern;

public class ClassGradeEx2_1 {

    public static void main(String[] args) {

        int price = 10000;
        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        // Classgrade classgrade = new ClassGrade();
        // int vip = discountService.discount(classgrade, price);
        /**
         * Classgrade classgrade = new ClassGrade();
         *      private 접근제한으로 다른 곳에서의 인스턴스 생성을 막았다.
         *      그러므로, 매개변수에 개발자가 의도한 값만 넣을 수 있게 되었다.
         * **/

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);



    }

}
