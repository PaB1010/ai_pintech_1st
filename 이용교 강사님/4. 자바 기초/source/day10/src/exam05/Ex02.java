package exam05;

public class Ex02 {
    public static void main(String[] args) {

        FruitBox<Apple> appleBox = new FruitBox<>();

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        // Apple || Fruit || Object 가능
        Juicer.make2(appleBox);
        // [사과, 사과, 사과]

        // <Grape>로는 불가능하지만 다형성 활용해 Fruit으로 형변환하면
        // Grape 담기 가능
        FruitBox<Fruit> grapeBox = new FruitBox<>();

        grapeBox.add(new Grape());
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());

        Juicer.make2(grapeBox);
        // [포도, 포도, 포도]
    }
}