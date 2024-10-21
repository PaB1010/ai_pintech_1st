// <T extends>

package exam04;

public class Ex02 {
    public static void main(String[] args) {

        Box<Apple> box = new Box<>();

        box.setItem(new Apple());

        // box = box.toString()
        // 즉 default는 주소값 출력
        System.out.println(box);

        // Toy는 Fruit의 하위 클래스가 아니라 오류
        // Box<Toy> toyBox = new Box<>();
    }
}