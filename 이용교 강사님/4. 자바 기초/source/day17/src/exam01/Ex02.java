// Arrays List.of & Arrays.asList(변경 불가 List)

package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {

        // 변경 불가 List 방법 1
        List<String> items = Arrays.asList("항목1", "항목2", "항목3");
        System.out.println(items);
        // [항목1, 항목2, 항목3]

        // 변경 불가 List 방법 2(주사용)
        List<String> items2 = List.of("항목1", "항목2", "항목3");
        System.out.println(items2);
        // [항목1, 항목2, 항목3]
    }
}