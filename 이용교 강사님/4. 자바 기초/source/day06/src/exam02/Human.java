// 하위 클래스

package exam02;

public class Human extends Animal {
    @Override
    public void move() {
        super.move();
    }

    public void reading() {
        System.out.println("독서한다");
    }

    /*
    @Override
    public void move() {

        // 상위 클래스인 Animal의 move
        // super.move();

        System.out.println("두발로 직립보행");
    }
     */
}