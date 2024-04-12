package enumeration.ex2_Type_Safe_Pattern;

public class ClassGrade {


    // 상수 활용
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // private 접근 제한으로 클래스 내부에서만 생성자 생성이 가능하다.
    private ClassGrade() {};

}
