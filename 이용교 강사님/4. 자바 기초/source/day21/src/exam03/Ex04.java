// LocalDate 변경 메서드

package exam03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex04 {
    public static void main(String[] args) {

        // 원데이터는 불변성 유지
        LocalDate today = LocalDate.now();

        // 100일 후 새로운 객체로 반환
        // LocalDate after100 = today.plus(100L, ChronoUnit.DAYS);
        LocalDate after100 = today.plusDays(100L);

        // 100일 전 새로운 객체로 반환
        // LocalDate before100 = today.minus(100L, ChronoUnit.DAYS);
        LocalDate before100 = today.minusDays(100L);

        System.out.println(today);
        // 2024-11-08
        System.out.println(after100);
        // 2025-02-16
        System.out.println(before100);
        // 2024-07-31

        LocalDate date2 = before100.withMonth(12);

        System.out.println(date2);
        // 2024-12-31
    }
}