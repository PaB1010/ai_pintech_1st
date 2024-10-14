// 직접 변수 값 대입시 통제 불가능
// 이런 이유로 객체 지향에서는 변수에 직접 대입하는것 지양

package exam02;

public class Ex01 {
    public static void main(String[] args) {

        Schedule s1 = new Schedule();

        s1.year = 2024;
        s1.month = 2;

        // 31이라는 잘못된 값을 검증하고 대입을 통제하는 방법 지금은 X
        // 2월 31일은 없음
        s1.day = 31;

        s1.showDate();
        // 2024년 2월 31일입니다.

    }
}