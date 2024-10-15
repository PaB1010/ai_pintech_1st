// 하위 클래스

package exam02;

public class Tiger extends Animal {

    @Override
    public void move() {
        System.out.println("네 발로 뛰어간다");
    }

    public void hunting () {
        System.out.println("사냥을 한다");
    }
}