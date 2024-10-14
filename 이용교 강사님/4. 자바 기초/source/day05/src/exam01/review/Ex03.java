// static 변수 & 메서드 올바른 접근법

package exam01.review;

public class Ex03 {
    public static void main(String[] args) {

        // 정적 변수 = 클래스 변수
        Student.id = 1000; // static 변수에 접근하는 권장사항

        // 정적 메서드
        Student.staticMethod();

        // Class 클래스 객체 -> 정적
        Class cls = Student.class;
    }
}