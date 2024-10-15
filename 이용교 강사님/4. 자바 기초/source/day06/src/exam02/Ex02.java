// 다형성 활용 배열화

package exam02;

public class Ex02 {
    public static void main(String[] args) {
        
        /*
        Animal[] animals = new Animal[3];
        // Animal animals[0] = new Tiger();
        animals[0] = new Tiger();
        // Animal animals[1] = new Bird();
        animals[1] = new Bird();
        // Animal animals[2] = new Human();
        animals[2] = new Human();
        */
        
        // 배열 생성과 동시에 초기화
        Animal[] animals = {new Tiger(), new Bird(), new Human()};
        

        // 향상된 for문
        for (Animal animal : animals) { // 업 캐스팅
            animal.move();

            // 형변환을 위해 객체 출처 체크
            if (animal instanceof Human) {
                // 다운 캐스팅 (범위가 human까지 넓어짐)
                Human human = (Human) animal;
                human.reading();

            // 위의 코드를 축약하는 신문법
            } else if (animal instanceof Bird bird) {
                bird.singing();

            } else if (animal instanceof Tiger tiger) {
                tiger.hunting();
            }
           
        }
    }
}