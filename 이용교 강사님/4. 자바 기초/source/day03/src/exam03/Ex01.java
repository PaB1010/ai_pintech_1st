// 객체 생성 (Student 클래스 참조)

package exam03;

public class Ex01 {
    public static void main(String[] args) {

        // 객체 생성, 여기서 비로소 new 연산자로 공간 할당
        Student s1 = new Student();

        // 변수가 됨 (대입 완료)
        s1.id = 1000;
        s1.name = "김이름";
        s1.major = "자바";
        
        // 함수 실행
        s1.study();
    }
}