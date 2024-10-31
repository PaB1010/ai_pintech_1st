// Iterator 메서드

package exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();

        for (int i = 0; i < 5; i++) items.add("항목" + (i + 1));

        // item.toString()이 이미 재정의 되어있음
        System.out.println(items);
        // [항목1, 항목2, 항목3, 항목4, 항목5]

        // 한번 쓰고 소비하는 방식
        Iterator<String> iter = items.iterator();

        // 다음 요소가 있는 동안 반복
        // 같은 while문을 한번 더 써도 매개변수 값이 false라서 두번째 반복은 되지 않음
        while(iter.hasNext()) {

            // 다음 요소 가져옴
            String item = iter.next();
            System.out.println(item);
            /*
            항목1
            항목2
            항목3
            항목4
            항목5
             */
        }

        // 반복을 더 하려면 새로운 Iterator 객체 생성 필수
        iter = items.iterator();

        while(iter.hasNext()) {

            // 다음 요소 가져옴
            String item = iter.next();
            System.out.println(item);
            /*
            항목1
            항목2
            항목3
            항목4
            항목5
             */
        }
    }
}