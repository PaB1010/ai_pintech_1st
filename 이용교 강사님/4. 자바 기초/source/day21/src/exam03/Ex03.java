// DayOfWeek - 요일 정보

package exam03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex03 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        // 요일 정보
        DayOfWeek week = today.getDayOfWeek();

        // 1(월)~7(일)
        int yoil = week.getValue();

        System.out.println(yoil);
        // 5 (금요일)

        String name = week.getDisplayName(TextStyle.SHORT, Locale.TRADITIONAL_CHINESE);

        System.out.println(name);
        // 週五

        String name2 = week.getDisplayName(TextStyle.FULL, Locale.JAPANESE);

        System.out.println(name2);
        // 金曜日
    }
}