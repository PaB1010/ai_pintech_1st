// 함수의 시그니쳐 & 매개변수 값으로 인스턴스 변수 값 초기화

package exam02;

public class Ex04 {
    int id; // 학번
    String name; // 학생명
    String major; // 전공과목

    public Ex04() {
        // 반환 값 = 객체의 주소
        // 객체 생성 이후 실행
        // 객체의 인스턴스 변수 값 초기화
        id = 1000;
        name = "이이름";
        major = "영어";
    }

    public Ex04(int _id, String _name, String _major) {
        // 생성자 매개변수로 값을 받아 인스턴스 변수 값 초기화
        id = _id;
        name = _name;
        major = _major;
    }

    void showInfo() { // 함수 정의

        System.out.printf("id = %d, name = %s, major = %s%n", id, name, major);
    }
}
