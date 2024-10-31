// ArrayList -> LinkedList & 다형성

package exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {

        // ArrayList<String> items = new ArrayList<>();
        // 같은 List 설계이기때문에 바꿔도 문제가 없음
        // LinkedList<String> items = new LinkedList<>();

        // 다형성으로 List 자료형 사용하는 것이 바람직
        List<String> items = new LinkedList<>();

        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        for (String item : items) {

            System.out.println(item);
        }
        // 항목1
        // 항목2
        // 항목3
        // 항목4
        // 항목5
    }
}