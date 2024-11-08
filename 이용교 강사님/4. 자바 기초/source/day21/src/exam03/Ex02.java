// LocalDate 메서드

package exam03;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class Ex02 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        /*
        int year = today.get(ChronoField.YEAR);
        int month = today.get(ChronoField.MONTH_OF_YEAR);
        int day = today.get(ChronoField.DAY_OF_MONTH);
         */

        int year = today.getYear();

        int month = today.getMonthValue();
        Month month2 = today.getMonth();

        int day = today.getDayOfMonth();

        System.out.printf("year = %d / month = %d / Month = %s / day=%d%n", year, month, month2, day);
        // year = 2024 / month = 11 / Month = NOVEMBER / day=8
    }
}