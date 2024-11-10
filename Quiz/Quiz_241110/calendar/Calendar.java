// 달력 만들기

package Quiz_241110.calendar;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int inputYear, inputMonth;

        while (true) {

            try {
                System.out.print("조회할 연도를 입력하세요 : ");

                inputYear = scan.nextInt();

                if (inputYear < 1 || inputYear > 9999) {

                    System.out.println("조회 연도는 1~9999 사이로 입력해주세요.입력 연도 : " + inputYear);

                    continue;

                }

                break;

            } catch (InputMismatchException e) {

                System.out.println("조회 연도는 숫자만 입력해 주세요.");

                scan.nextLine();
            }
        }

        while (true) {

            try {
                System.out.print("조회할 월을 입력하세요 : ");

                inputMonth = scan.nextInt();

                if (inputMonth < 1 || 12 < inputMonth) {

                    System.out.println("조회할 월은 1~12 사이로 입력해주세요. 입력 월 : " + inputMonth);

                    continue;
                }

                break;

            } catch (InputMismatchException e) {

                System.out.println("조회 월은 숫자만 입력해 주세요.");

                scan.nextLine();
            }

        }

        // 1일
        LocalDate sdate = LocalDate.of(inputYear, inputMonth, 1);

        // 말일
        LocalDate edate = sdate.plusMonths(1L).minusDays(1L);

        int sDayOfWeek = sdate.getDayOfWeek().getValue();

        if (sDayOfWeek == 7) {

            sDayOfWeek = 0;
        }

        System.out.println("요청하신 " + sdate.getMonth().getDisplayName(TextStyle.FULL, Locale.KOREAN) + " 달력입니다.");

        System.out.println("일\t월\t화\t수\t목\t금\t토");

        for (int i = 0; i < sDayOfWeek; i++) {

            System.out.print("\t");
        }

        for (int day = 1; day <= edate.getDayOfMonth(); day++) {

            System.out.print(day + "\t");

            if ((sDayOfWeek + day) % 7 == 0) {
                System.out.println();
            }

        }

        System.out.println();

        System.out.println("이 달의 1일은 " + sdate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN) + "입니다.");

        System.out.println("이 달의 말일은 " + edate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN) + "입니다.");
    }
}