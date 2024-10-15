// 상위 클래스

package exam02;

public class Animal {

    // 인스턴스 메서드
    // 하위 클래스에서 protected -> public으로 오버라이드
    // 메서드 오버라이딩 염두하고 상위 클래스는 protected인 경우가 많음
    protected void move() {
        System.out.println("움직인다.");
    }
}

/*
Animal 클래스의 추상화 (이게 더 적합)
public abstract class Animal {
    public abstract void move();
}
 */