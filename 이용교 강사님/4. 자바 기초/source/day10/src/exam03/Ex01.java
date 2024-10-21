// JDK 4 이전 구문법 Object 형변환 단점1
// 형변환의 번거로움

package exam03;

public class Ex01 {
    public static void main(String[] args) {

        Box appleBox = new Box();

        // 담기는 이유 = 매개변수가 Object
        appleBox.setItem(new Apple());

        // Box 클래스에서 반환 값이 Object라서
        // Object apple = appleBox.getItem();
        // apple.info() < 이상태로는 info 메서드 접근 불가 오류

        // 명시적 형변환(Apple)을 통해 접근 범위를 늘려 info 메서드 접근 가능
        // 형변환의 번거로움
        Apple apple = (Apple)appleBox.getItem();
        System.out.println(apple.info());
        // 사과


        Box grapeBox = new Box();
        // 담기는 이유 = 매개변수가 Object
        grapeBox.setItem(new Grape());

        // 명시적 형변환(Grape)을 통해 접근 범위를 늘려 info 메서드 접근 가능
        // 형변환의 번거로움
        Grape grape = (Grape)grapeBox.getItem();
        System.out.println(grape.info());
        // 포도
    }
}