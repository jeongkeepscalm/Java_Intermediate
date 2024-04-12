package enumeration.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AuthGradeMain2_mine {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = reader.readLine();

        for (AuthGrade authGrade : AuthGrade.values()) {
            if (authGrade.name().equals(grade.toUpperCase())) {
                System.out.println("당신의 등급은 " + authGrade.getDescription()+"입니다");
                System.out.println("=== 메뉴 목록 ===");
                for (String menu : authGrade.getAuthmenu()) {
                    System.out.println(" - " + menu);
                }
            }
        }

    }



}
