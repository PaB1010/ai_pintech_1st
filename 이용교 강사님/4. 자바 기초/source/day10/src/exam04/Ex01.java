// 지네릭 클래스 사용

package exam04;

public class Ex01 {
    public static void main(String[] args) {

        // 타입을 <Apple>로 미리 명시
        // Box 지네릭 클래스의 모든 T가 Apple로 명시적 형변환
        // Box<Apple> appleBox = new Box<Apple>();
        // 이미 = 왼쪽만 봐도 <Apple>로 인해 지네릭 클래스인것이 명확해
        // = 우측에서는 <안의 내용> 생략 가능
        Box<Apple> appleBox = new Box<>();
        
        // Apple 담음(set)
        appleBox.setItem(new Apple());

        // 타입 안정성 확보
        // 사과 상자에 포도는 안들어감(오류)
        // appleBox.setItem(new Grape());
        
        // 명시적 형변환 없이 get 가능
        // 지네릭스 이전 구문법
        // Apple apple = (Apple)appleBox.getItem();
        Apple apple = appleBox.getItem();


        // 타입을 <Grape>로 미리 명시
        // Box 지네릭 클래스의 모든 T가 Grape로 명시적 형변환
        // Box<Grape> grapeBox = new Box<Grape>();
        // 이미 = 왼쪽만 봐도 <Grape>로 인해 지네릭 클래스인것이 명확해
        // = 우측에서는 <안의 내용> 생략 가능
        // Box<Grape> grapeBox = new Box<>();

        // 타입 안정성 확보
        // 포도 상자에 사과는 안들어감(오류)
        // grapeBox.setItem(new Apple());
        // grapeBox.setItem(new Grape());

        // 명시적 형변환 없이 get 가능
        // 지네릭스 이전 구문법
        // Grape grape = (Grape)grapeBox.getItem();
        // Grape grape = grapeBox.getItem();
    }
}