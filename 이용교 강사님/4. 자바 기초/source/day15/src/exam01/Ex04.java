// ListIterator 메서드

package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex04 {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();

        for (int i = 0; i < 5; i++) items.add("항목" + (i + 1));


        ListIterator<String> iter = items.listIterator();

        // 순방향 조회
        System.out.println("----- 순방향 ----");
        // 처음부터 끝까지
        while(iter.hasNext()) {
            String item = iter.next();
            System.out.println(item);
        }
        /*
        항목1
        항목2
        항목3
        항목4
        항목5
         */

        // 역방향 조회
        System.out.println("----- 역방향 ----");
        // 처음부터 끝까지
        while(iter.hasPrevious()) {
            String item = iter.previous();
            System.out.println(item);
        }
        /*
        항목5
        항목4
        항목3
        항목2
        항목1
         */
    }
}