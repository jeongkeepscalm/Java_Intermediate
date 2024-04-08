package lang.immutable.address;

public class MemberMain {
    public static void main(String[] args) {

        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV1 m1 = new MemberV1("회원A", address);
        MemberV2 m2 = new MemberV2("회원B", address);

        System.out.println("memberA : " + m1);
        System.out.println("memberB : " + m2);

//        m2.getAddress().setValue("부산"); 불가능
        m2.setAddress(new ImmutableAddress("부산"));

        System.out.println("memberA : " + m1);
        System.out.println("memberB : " + m2);

    }
}
