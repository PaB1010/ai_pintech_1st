// 지네릭스 타입 매개변수 여러개

package exam05;

// 지네릭 클래스 (타입 매개변수 두개)
public class Box<T, U> {
    private T item1;
    private U item2;

    private T method1() {
        return null;
    }

    // 타입 매개변수를 가지고 있는 인스턴스 메서드
    // Box 클래스로부터 객체가 생성될때 T, U 결정
    // 여기의 T, U = 6행에서 온 지네릭 클래스의 타입 변수 T,  U
    private void method2(T t, U u) {

    }

    // 위와 아래는 명확히 다름

    // 지네릭 메서드
    // 메서드가 호출 될때 T, U가 결정(매개변수의 값의 타입에 따라)
    // 여기의 (T t, U u)는 26행의 <T, U)
    public <T, U> void method3(T t, U u) {

    }
}