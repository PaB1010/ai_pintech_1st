// valueOf()로 문자열을 Enum 클래스의 정적 상수로 변환

package exam04;

public class Ex04 {
    public static void main(String[] args) {

        String transStr = "BUS";

        Transportation trans = Enum.valueOf(Transportation.class, transStr);

        System.out.println(trans);
        // BUS

        System.out.println(trans instanceof Transportation);
        // true

    }
}