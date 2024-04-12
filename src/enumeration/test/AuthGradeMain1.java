package enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {

        /*
            grade=GUEST, level=1, 설명=손님
            grade=LOGIN, level=2, 설명=로그인 회원
            grade=ADMIN, level=3, 설명=관리자
        */

        for (AuthGrade authGrade : AuthGrade.values()) {
            printSth(authGrade);
        }

    }

    public static void printSth(AuthGrade authGrade) {
        System.out.println("grade= " + authGrade.name() + ", level= " + authGrade.getLevel() + ", 설명= " + authGrade.getDescription());
    }
}
