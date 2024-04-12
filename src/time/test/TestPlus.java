package time.test;

import java.time.LocalDateTime;
import java.time.Year;

public class TestPlus {

    public static void main(String[] args) {

        // 2024년 1월 1일 0시 0분 0초에 1년 2개월 3일 4시간 후의 시각을 찾아라.
        LocalDateTime dt = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime dtPlused = dt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);

        System.out.println(dt);
        System.out.println(dtPlused);

    }
}
