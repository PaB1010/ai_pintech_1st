// stream은 일회용

package exam01;

import java.util.List;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {

        List<String> items = List.of("항목1", "항목1", "항목1", "항목2", "항목3", "항목4", "항목5");
        Stream<String> stm = items.stream();

        List<String> items2 = stm.distinct().map(s -> String.format("**%s**", s)).toList();
        System.out.println(items2);
        // [**항목1**, **항목2**, **항목3**, **항목4**, **항목5**]

        /*
        한번 사용한 stream 객체(stm)을 다시 사용하려하니 stm이 사라져있어서 오류
        stream은 일회용!
        
        List<String> items3 = stm.distinct().map(s -> String.format("**%s**", s)).toList();
        System.out.println(items3);
         */
    }
}
