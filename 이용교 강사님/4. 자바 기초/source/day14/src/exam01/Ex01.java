// List 구현 클래스 - ArrayList

package exam01;

import java.util.ArrayList;

public class Ex01 {

    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();

        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        /*
        for (int i = 0; i < items.size(); i++) {

            items.remove(i);
            System.out.println();
            // 항목2
            // 항목4
            // 왜 index[1]과 index[3]이 남을까? 그림 참고
            // index[0]이 삭제된다고 떙겨져서 index[1]이 index[0]이 되는게 아니라 (배열 순서 변경 불가)
            // 내부적으로 배열을 새로 만듬
            // 즉 index[0]이 아니라 맨 끝 index부터 삭제하면 배열이 바뀌지 않음
        }\
         */

        for (int i = items.size() -1 ; i >= 0; i--) {
            String item = items.remove(i);
            // 뒤에서부터 순서대로 삭제하므로 모든 index가 잘 삭제됨
            System.out.printf("꺼낸 요소 : %s%n", item);
            System.out.printf("배열 상태 : %s%n", items);
            /*
            꺼낸 요소 : 항목5
            배열 상태 : [항목1, 항목2, 항목3, 항목4]
            꺼낸 요소 : 항목4
            배열 상태 : [항목1, 항목2, 항목3]
            꺼낸 요소 : 항목3
            배열 상태 : [항목1, 항목2]
            꺼낸 요소 : 항목2
            배열 상태 : [항목1]
            꺼낸 요소 : 항목1
            배열 상태 : []
             */
        }

        // 안됨
        // items.forEach(items :: remove);


        for (int i = 0; i < items.size(); i++) {

            String item = items.get(i);
            System.out.println(item);
            // 항목1
            // 항목2
            // 항목3
            // 항목4
            // 항목5
        }

        // =
        // items.forEach(System.out :: println);


    }
}