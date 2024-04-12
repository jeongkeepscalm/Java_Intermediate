package time.test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

public class C_TestBetween {

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

        Period between = Period.between(startDate, endDate);
        long days = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.printf("시작 날짜: %s", startDate);
        System.out.printf("\n목표 날짜: %s", endDate);
        System.out.printf("\n남은 기간: %s년 %s개월 %s일 ", between.getYears(), between.getMonths(), between.getDays());
        System.out.printf("\n디데이: %s일 남음", days);

        /**
         * period       년월일
         * duration     시분초
         * get D-day    ChronoUnit.DAYS.between(시작날짜, 끝날짜)
         * **/

    }
}
