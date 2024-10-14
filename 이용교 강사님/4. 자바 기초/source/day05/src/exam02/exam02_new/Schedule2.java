package exam02.exam02_new;

public class Schedule2 {
    private int year;
    private int month;
    private int day;

    public Schedule2() {
        // this()는 항상 맨 앞에 있어야 함
        this(2024,10,14);
//        year = 2024;
//        month = 10;
//        day = 14;
    }

// 이 함수로 인해 객체를 만들 수 있는 수단이 있기때문에
// 기본 생성자를 수동 생성하지 않을경우 오류
    public Schedule2(int year, int month, int day) {
        // 객체가 생성된 이후 실행되는 코드
        // 객체 내 변수의 초기화 작업 주로
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        // s1.year = this.year
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showInfo() {
        
        // 출처가 명확해 this. 생략 가능
        System.out.printf("Year = %d, Month = %d, Day = %d%n", this.year, month, day);

        // this.printThis();
        // 출처가 명확해 this. 생략 가능
        printThis();
    }

    public void printThis() {
        System.out.println(this);
    }

    public Schedule2 getThis() {
        return this;
    }
}