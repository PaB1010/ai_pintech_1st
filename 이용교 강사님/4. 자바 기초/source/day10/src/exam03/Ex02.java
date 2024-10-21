// JDK 4 이전 구문법 Object 형변환 단점2
// 타입 안정성 떨어짐

package exam03;

public class Ex02 {
    public static void main(String[] args) {

        Box appleBox = new Box();

        // 사과만 담으려고 했는데 포도도 담기는 오류
        appleBox.setItem(new Grape());

        // Apple apple = (Apple)appleBox.getItem();
        // 타입 안정성이 떨어짐

        // 포도를 담고 사과를 꺼내려니 오류
        // System.out.println(apple);

        // Exception in thread "main" java.lang.ClassCastException: class exam03.Grape cannot be cast to class exam03.Apple (exam03.Grape and exam03.Apple are in unnamed module of loader 'app')
        // at exam03.Ex02.main(Ex02.java:13)


        // Apple apple = (Apple)appleBox.getItem();
        // 타입 안정성이 떨어짐
        // 사과박스에 사과만 담기위해 instanceof 연산 사용
        Object _apple = appleBox.getItem();
        if (_apple instanceof Apple) {
            Apple apple = (Apple) _apple;
        }
    }
}