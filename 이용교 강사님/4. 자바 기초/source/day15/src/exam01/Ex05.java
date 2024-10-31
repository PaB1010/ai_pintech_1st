// Set 구현 클래스 메서드

package exam01;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex05 {
    public static void main(String[] args) {

        Set<String> items = new HashSet<>();

        items.add("이름1");
        items.add("이름1");
        items.add("이름1");
        items.add("이름2");
        items.add("이름3");
        items.add("이름4");
        items.add("이름5");

        System.out.println(items);
        // [이름3, 이름2, 이름1, 이름5, 이름4]
        // 이름1 중복 제거 & 순서 섞여있지만 고정되어있음(add순서 바꿔도 그대로)

        // (문자열)빠른 검색(Hashcode)위해 효율적인 이진트리 구조로 재구성
    }
}