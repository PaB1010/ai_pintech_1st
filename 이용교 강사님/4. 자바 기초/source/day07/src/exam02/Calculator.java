// interface 클래스 (생성시 class말고 interface 선택)

package exam02;

// 여기도 접근 제어자 public 한정
public interface Calculator {

    // 추상 메서드 앞에 public abstract 컴파일러가 자동 추가
    // 즉 접근 제어자 무조건 public 한정
    int add(int num1, int num2);

}