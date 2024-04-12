package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class D_TestAdjusters {

    public static void main(String[] args) {

        // 시작 요일, 마지막 요일 구하기
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);

        DayOfWeek firstDayOfWeek = date.getDayOfWeek();
        LocalDate lastDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfMonth.getDayOfWeek() = " + lastDayOfMonth.getDayOfWeek());

        /**
         * LocalDate.with(TemporalAdjusters.__) 으로 다음주/마지막날 등 을 구할 수 있다.
         * **/

    }
}
