// 합집합 유니온 연산(중복 제거)
// Set<>

package exam05;

import java.util.HashSet;
import java.util.Set;

public class Ex05 {
    public static void main(String[] args) {

        // 집합 자료형 (중복 없음 = 동등시 중복 제거)
        Set<String> items = new HashSet<>();

        items.add(new String("ABC"));
        items.add(new String("ABC"));
        items.add("ABC");
        // 3개의 "ABC"들은 모두 동등해 중복이 제거되어 1개가 됨

        items.add("DEF");
        items.add("GHI");

        System.out.println(items);
        // [ABC, DEF, GHI]

    }
}