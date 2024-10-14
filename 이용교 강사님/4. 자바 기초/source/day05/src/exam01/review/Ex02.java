// static 변수 & 메서드 틀린 접근법
// static 변수(메서드)인지 인스턴스 변수(메서드)인지 구분 어려움

package exam01.review;

public class Ex02 {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.id = 1000; // 지양
        s1.name = "김이름";
        s1.major = "수학";

        s1.showInfo();
        // id : 1000

        Student s2 = new Student();

        s2.id = 1001; // 지양
        s2.name = "이이름";
        s2.major = "영어";

        s2.showInfo();
        // id : 1001

        s1.showInfo();
        // id : 1001

        s2.staticMethod(); // 지양
        // 정적 메서드!
    }
}