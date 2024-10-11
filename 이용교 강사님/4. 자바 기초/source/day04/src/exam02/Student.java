// Student 객체 정의한 클래스

// exam02.Student : 전체 클래스명
package exam02;

public class Student { // 변수 정의
    int id; // 학번
    String name; // 학생명
    String major; // 전공과목

    // default 기본 생성자
    // 따로 정의하지 않으면 기본 생성됨
    public Student() {
        // 반환 값 = 객체의 주소
        // 객체 생성 이후 실행
        // 객체의 인스턴스 변수 값 초기화
        id = 1000;
        name = "이이름";
        major = "영어";
    }

    public Student(int _id, String _name, String _major) {
        // 생성자 매개변수로 값을 받아 인스턴스 변수 값 초기화
        id = _id;
        name = _name;
        major = _major;
    }

    void showInfo() { // 함수 정의

        System.out.printf("id = %d, name = %s, major = %s%n", id, name, major);
    }
}