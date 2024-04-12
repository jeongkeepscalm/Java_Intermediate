package time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

public class TestLoopPlus {

    public static void main(String[] args) {

        // 2024년 1월 1일 부터 2주 간격으로 5번 반복하여 날짜를 출력하는 코드를 작성하세요

        LocalDate dt = LocalDate.of(2024, 1, 1);

        for (int i = 0; i < 5; i++) {
            // ChronoUnit.WEEKS: Weeks
            LocalDate plusedDate = dt.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println(plusedDate);
        }

    }

}
