// get / set & 메소드 이용 통제

package exam02.exam02_new;

public class Schedule {
    // default 접근 제어자
    private int year;
    private int month;
    private int day;

    // 외부에 투입된 값을 year 변수에 할당
    public void setYear(int _year) {
        // year(객체) -> 힙 메모리 _year(지역변수) -> 스택 메모리
        year = _year;
    }

    // 단순히 값 조회를 위한 함수라 매개변수 필요 X
    public int getYear() {
        return year;
    }

    public void setMonth(int _month) {
        month = _month;
    }

    public int getMonth() {
        return month;
    }

    // 메소드로 통제
    public void setDay(int _day) {

        // 통제 가능
        if (month == 2 && _day > 28) {
            _day = 28;
        }

        day = _day;
    }

    public int getDay() {
        return day;
    }



    // default 접근 제어자
    void showDate () {
        System.out.printf("%d년 %d월 %d일입니다.%n", year, month, day);
    }
}
