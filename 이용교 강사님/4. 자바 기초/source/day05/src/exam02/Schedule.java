// 년, 월, 일을 입력받는 클래스

package exam02;

public class Schedule {

    // default 접근 제어자
    int year;
    int month;
    int day;

    // default 접근 제어자
    void showDate () {
        System.out.printf("%d년 %d월 %d일입니다.%n", year, month, day);
    }
}