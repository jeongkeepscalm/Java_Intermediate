package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class F_TestCalendarPrinter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalendar(year, month);

    }

    private static void printCalendar(int year, int month) {

        // 해당 월의 첫번째 요일을 구한다.
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);

        // 해당 월에 한 달을 더한 값.
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        // 요일 출력
        String[] days = new String[]{"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};
        System.out.println(String.join(" ",days));

        String blank = " ".repeat(3);
        int firstDayValue = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        System.out.print(blank.repeat(firstDayValue));

        // 다음달 1일 전까지 반복
        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }

    }

}
