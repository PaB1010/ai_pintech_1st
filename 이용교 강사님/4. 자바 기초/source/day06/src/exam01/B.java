// A 클래스 상속 받기

package exam01;

public class B extends A {
    
    int numB = 20;

    // 디폴트 생성자
    public B () {

        // 상속시 디폴트 생성자처럼 정의하지 않아도 항상 첫줄에 컴파일러가 자동 추가
        super();
        // A 클래스의 디폴트 생성자를 의미 = A()

        System.out.println("B 생성자");
    }
}