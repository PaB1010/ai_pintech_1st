// A 클래스 상속 받은 B 클래스 상속 받기

package exam01;

public class C extends B {

    int numC = 30;

    // 디폴트 생성자
    public C() {

        // 상속시 디폴트 생성자처럼 정의하지 않아도 항상 첫줄에 컴파일러가 자동 추가
        super();
        // B 클래스의 디폴트 생성자를 의미 = B()

        System.out.println("C 생성자");
    }
}