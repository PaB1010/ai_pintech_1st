// 오늘 날짜 기준 달력

package exam03;

import java.time.LocalDate;

public class Ex05 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        // 시작일자
        LocalDate sdate = LocalDate.of(today.getYear(), today.getMonthValue(), 1);

        int yoil = sdate.getDayOfWeek().getValue();

        System.out.println(yoil);

        System.out.println(sdate);
        // 2024-11-01

        LocalDate edate = sdate.plusMonths(1L).minusDays(1L);

        System.out.println(edate);
        // 2024-11-30
    }
}