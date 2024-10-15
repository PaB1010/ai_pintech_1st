// B 클래스에게 상속해주기

package exam01;

public class A {

    int numA = 10;

    // 디폴트 생성자
    public A () {

        // 상속 관계상 가장 상위 클래스인 A 클래스의 super는 추후 설명
        // public class A 내부의 숨겨진 코드를 가리킴
        super();

        System.out.println("A 생성자");
    }
}