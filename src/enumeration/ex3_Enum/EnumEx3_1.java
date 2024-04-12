package enumeration.ex3_Enum;

import static enumeration.ex3_Enum.Grade.*;

public class EnumEx3_1 {

    public static void main(String[] args) {

        int price = 10000;
        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);

        /** ENUM 클래스를 활용하여 매개변수에 개발자가 의도한 값만 받게 되었다.
         *
         * 열거형(ENUM)의 장점
         * 타입 안정성 향상: 열거형은 사전에 정의된 상수들로만 구성되므로, 유효하지 않은 값이 입력될 가능성이 없다. 이런 경우 컴파일 오류가 발생한다.
         * 간결성 및 일관성: 열거형을 사용하면 코드가 더 간결하고 명확해지며, 데이터의 일관성이 보장된다.
         * 확장성: 새로운 회원 등급을 타입을 추가하고 싶을 때, ENUM에 새로운 상수를 추가하기만 하면 된다.
         * **/
    }

}
