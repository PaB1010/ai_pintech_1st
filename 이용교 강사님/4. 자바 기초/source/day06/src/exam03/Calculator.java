// 추상 클래스 (인스턴스화 O)

package exam03;

// abstract 예약어를 접근 제어자 뒤에 사용
// 접근 제어자 앞도 가능하지만 관례상 뒤에 사용
public abstract class Calculator {

    // 인스턴스 변수
    int num = 10;
    
    public Calculator() {
        System.out.println("Calculator 생성자 호출");
    }

    public abstract int add(int num1, int num2)
    // { 메서드 정의 내용 (실행 코드) } 생략해 추상화
    ;

    // public abstract int minus(int num1, int num2);
}