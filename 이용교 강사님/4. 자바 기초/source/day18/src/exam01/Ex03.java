// Stream 내부 반복 구현

package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Ex03 {
    public static void main(String[] args) {
        String[] items = {"항목1", "항목1", "항목1", "항목2", "항목3", "항목4", "항목5"};

        List<String> newItems = map(items, s -> s + "💙");
        System.out.println(newItems);
    }

    public static List<String> map(String[] items, UnaryOperator<String> opr) {
        List<String> newItems = new ArrayList<>();

        // newItem는 추상 (apply에게 실어 나르기만 함)
        // 내부 반복
        for (String item : items) {

            String newItem = opr.apply(item);
            newItems.add(newItem);
        }

        return newItems;
    }
}