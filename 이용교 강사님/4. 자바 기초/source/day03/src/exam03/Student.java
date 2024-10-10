// 클래스 정의(변수, 함수 정의)

package exam03;

public class Student {

    // 변수 정의 (공간(메모리) 할당X -> 즉 변수X)
    int id; // 학번
    String name; // 이름
    String major; // 전공 과목

    // 함수 정의
    void study() {
        System.out.printf("%s는(은) 학번이 %d이고 %s를 공부한다.%n", name, id, major);
    }
}