// 지네릭 클래스 정의 & 제한

package exam04;

// 매개변수가 여러개 일경우 T 뒤로 이어서 T, U, V가 관례
// 타입 매개변수<T>가 있는 지네릭 클래스
// extends Fruit으로 명확하게 T는 Fruit의 하위 클래스
public class Box<T extends Fruit & Eatable > {

    // private Object item; 동일
    private T item;

    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }

    // private static T
    // 처음부터 변수인 static은 자료형이 명확하게 정의되어 있어야함
    // 지네릭 내 정의 불가능 = 오류

    // private T[] items = new T[3];
    // new 연산자(객체 생성)로 메모리 생성을 하려면
    // 자료형이 명확해야만 할당 용량 계산 가능
    // 배열 생성 불가능 = 오류

    // 배열 정의까지는 가능해도 new 연산은 불가하므로 무쓸모
    private T[] items;


    public String toString() {
        // Fruit가 없을때!
        // item = Apple, apple.info() 가 아님
        // Object.info() 현재 상태
        // 오류!
        // String info = item.info();

        // Object item X
        // Fruit item O
        String info = item.info();
        return info;
    }
}