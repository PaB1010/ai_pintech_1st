// 생성자 메서드 함수

package exam02;

public class Ex02 {
    public static void main(String[] args) {

        // Student(); 생성자 메서드(객체 생성 함수)
        Student s1 = new Student();

        s1.showInfo();
        // Student 기본 생성자에 할당된 name인 이이름으로 출력

        s1.name = "(수정)이이름";
        s1.showInfo();
        // s1.name에 새로 대입한 (수정)이이름으로 출력
    }
}