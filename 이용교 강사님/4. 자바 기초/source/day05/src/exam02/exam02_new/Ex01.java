// get / set & 메서드 이용 통제

package exam02.exam02_new;
public class Ex01 {
    public static void main(String[] args) {

        Schedule s1 = new Schedule();

        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);

       s1.showDate();
       // 2024년 2월 28일입니다.

        int month2 = s1.getMonth();
        System.out.println(month2);
        // 2

    }
}