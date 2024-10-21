package exam05;

public class Ex01 {
    public static void main(String[] args) {

        // Apple & Grape & Fruit 가능
        FruitBox<Fruit> appleBox2 = new FruitBox<>();

        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        // 사과 주스 (지네릭 메서드)
        Juicer.make(appleBox);

        FruitBox<Grape> grapeBox = new FruitBox<>();
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());

        // 포도 주스 (지네릭 메서드)
        Juicer.make(grapeBox);
        
        FruitBox<Toy> toyBox = new FruitBox<>();
        // Juicer 지네릭 메서드에 extends Fruit 상한 제한을 걸어 Toy는 사용 불가
        // Juicer.make(toyBox);
    }
}