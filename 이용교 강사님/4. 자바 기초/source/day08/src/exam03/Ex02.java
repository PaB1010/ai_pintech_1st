package exam03;

public class Ex02 {
    public static void main(String[] args) {

        // 다형성 Human, Object
        // Object human = new Human();
        // =
        Human human = new Human();

        // 다형성 Bird, Object
        // Object bird = new Bird();
        // =
        Bird bird = new Bird();

        // 다형성 Tiger, Object
        // Object tiger = new Tiger();
        // =
        Tiger tiger = new Tiger();

        Object[] animals = new Object[3];
        animals[0] = human;
        animals[1] = bird;
        animals[2] = tiger;

    }
}