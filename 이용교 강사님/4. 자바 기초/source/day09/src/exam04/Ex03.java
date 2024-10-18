// Enum 클래스의 메서드 사용

package exam04;

public class Ex03 {
    public static void main(String[] args) {

        Transportation trans = Transportation.SUBWAY;
        Transportation trans2 = Transportation.BUS;

        // trans.toString(); 과 동일한 기능
        // 차이점은 변경 가능/불가능 여부
        String transStr = trans.name();

        System.out.println(transStr);
        // SUBWAY

        // 상수가 정의된 순서 위치 번호 (index 값)
        int ordinal = trans.ordinal();
        System.out.println(ordinal);
        // 0

        int ordinal2 = trans2.ordinal();
        System.out.println(ordinal2);
        // 1

    }
}