// static 변수
// 객체 정의, 단순 코드 -> 데이터 영역 메모리

package exam01.review;

public class Student {

    static int id; // 학번
    String name; // 학생명
    String major; // 전공

    public Student(){}

    void showInfo () {
        System.out.printf("ID : %d, NAME : %s, MAJOR : %s%n", id, name, major);
    }

    static void staticMethod() {
        System.out.println("정적 메서드!");

        // 정적(static) 메서드이므로 this 사용 불가
        // this.name = "이이름";
        // showInfo();

        // 정적(static) 변수에는 접근 가능
        id = 2000;

        // 정적(static) 메서드에는 접근 가능
        staticMethod2();
    }

    static void staticMethod2() {

    }
}