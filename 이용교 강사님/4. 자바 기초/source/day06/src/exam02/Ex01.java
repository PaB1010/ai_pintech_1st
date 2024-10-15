// 다형성 활용

package exam02;

public class Ex01 {
    public static void main(String[] args) {

        // Animal 클래스를 상속받은 클래스들
        // Tiger tiger = new Tiger(); // 가능 자료형(다형성) = Tiger & Animal
        Animal tiger = new Tiger();
        tiger.move();

        // Bird bird = new Bird(); // 가능 자료형(다형성) = Bird & Animal
        Animal bird = new Bird();
        bird.move();

        // Human human = new Human(); // 가능 자료형(다형성) = Human & Animal
        Animal human = new Human();
        human.move();


    }
}