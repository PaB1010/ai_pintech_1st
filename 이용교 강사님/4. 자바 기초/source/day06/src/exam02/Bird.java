// 하위 클래스

package exam02;

public class Bird extends Animal {

    @Override
    public void move() {
        System.out.println("두 날개로 날아간다");
    }

    public void singing() {
        System.out.println("노래한다");
    }
}