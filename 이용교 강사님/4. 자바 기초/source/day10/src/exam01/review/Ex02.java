// 컴파일러 자동 추가 메서드들 & valueOf()

package exam01.review;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {

        // 문자열 -> Enum 상수 객체로 변경
        // Transportation trans = Enum.valueOf(Transportation.class, "SUBWAY");
        // System.out.println(trans);
        // SUBWAY

        Transportation trans = Transportation.valueOf("SUBWAY");
        System.out.println(trans);
        // SUBWAY
        
        // Transportation에 정의된 상수 목록
        Transportation[] items = Transportation.values();
        System.out.println(Arrays.toString(items));
        // [SUBWAY, BUS, TAXI]

    }
}