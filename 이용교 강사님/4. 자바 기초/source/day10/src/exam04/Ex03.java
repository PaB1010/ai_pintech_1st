// extends & implements

package exam04;

public class Ex03 {
    public static void main(String[] args) {

        // Fruit & Eatable 모두 상속
        Box<Apple> appleBox = new Box<>();

        // Fruit 상속 Eatable 미상속으로 오류
        // Box<Grape> grapeBox = new Box<>();

        // = 좌우의 타입 매개변수가 불일치로 오류
        // Box<Apple> appleBox2 = new Box<Grape>();

        // 다른 것을 한 변수에 담을때에는 다형성 이용
        /* Box<Fruit> fruitBox = new Box<Fruit>();
        fruitBox.setItem(new Grape());
        fruitBox.setItem(new Apple());
         */

    }
}