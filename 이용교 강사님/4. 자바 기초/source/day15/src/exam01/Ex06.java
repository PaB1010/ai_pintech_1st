package exam01;

import java.util.ArrayList;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {

        UniqueList<String> items = new UniqueList<>();

        items.add("이름1");
        items.add("이름1");
        items.add("이름1");
        items.add("이름2");
        items.add("이름3");
        items.add("이름4");
        items.add("이름5");

        System.out.println(items);

        // 변경 불가 List
        List<String> tuple = List.of("이름1", "이름2");
        List<String> list = new ArrayList<>(tuple);

        // 변경 불가이므로 오류
        // tuple.set(0, "이름3");

        System.out.println(tuple);

        System.out.println(list);
    }
}
