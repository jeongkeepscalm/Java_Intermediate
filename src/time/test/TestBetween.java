package time.test;

import javax.swing.text.DateFormatter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TestBetween {

    public static void main(String[] args) throws IOException {

        /*
            시작 날짜와 목표 날짜를 입력해서 남은 기간과 디데이를 구해라.

            == 실행결과 ==
            시작 날짜: 2024-01-01
            목표 날짜: 2024-11-21
            남은 기간: 0년 10개월 20일
            디데이: 325일 남음
        */

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);


    }
}
