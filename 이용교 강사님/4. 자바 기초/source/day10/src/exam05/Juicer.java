// 와일드 카드(지네릭 메서드)
// 지네릭 타입의 메서드 오버로드?

package exam05;

import java.util.List;

public class Juicer {

    /*

    // 메서드 오버로드 안되고 오류 뜨는 이유?
    // 지네릭 클래스와 마찬가지로 컴파일시 자료형이 제거되어 동일한 시그니처가 됨
    // 메서드 중복 정의, 정의 불가
    public static void make(FruitBox<Apple> appleBox) {

        List<Apple> items = appleBox.getItems();
        System.out.println(items);
    }

    public static void make(FruitBox<Grape> grapeBox) {
        List<Grape> items = grapeBox.getItems();
        System.out.println(items);
    }
     */

    // 와일드 카드(지네릭 메서드)

    // 상한 제한
    // ? = Apple Grape Fruit 가능
    public static void make(FruitBox<? extends Fruit> fruitBox) {
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    // 매개 변수 부분을 줄여쓸 수 있음
    // 단 super는 불가능
    public static <T extends Fruit> void make3(FruitBox<T> fruitBox) {

    }

    // 하한 제한
    // ? = Apple Fruit Object 가능 & Grape 불가능
    public static void make2(FruitBox<? super Apple> fruitBox) {

        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }
}