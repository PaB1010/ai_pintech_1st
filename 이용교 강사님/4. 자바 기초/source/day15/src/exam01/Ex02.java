// LinkedList 메서드
package exam01;

import java.util.LinkedList;
import java.util.Queue;

public class Ex02 {
    public static void main(String[] args) {

        // Queue 메서드 사용 위해 List말고 Queue로 다형성
        Queue<String> items = new LinkedList<>();

        /*
        items.offer("항목1");
        items.offer("항목2");
        items.offer("항목3");
        items.offer("항목4");
        items.offer("항목5");
         */

        for (int i = 0; i < 5; i++) items.offer("항목" + (i + 1));


        while(items.size() > 0) {

            // 첫번째 요소 꺼내기
            String item = items.poll();
            System.out.println(item);
            System.out.println(items);
        }

        /*
        항목1
        [항목2, 항목3, 항목4, 항목5]
        항목2
        [항목3, 항목4, 항목5]
        항목3
        [항목4, 항목5]
        항목4
        [항목5]
        항목5
        []
         */
    }
}