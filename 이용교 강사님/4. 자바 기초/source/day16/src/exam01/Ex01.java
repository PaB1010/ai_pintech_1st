// Set- Hashset

package exam01;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {

        Set<String> items = new HashSet<>();

        items.add("이름1");
        items.add("이름1");
        items.add("이름2");
        items.add("이름4");
        items.add("이름3");
        items.add("이름1");
        items.add("이름5");
        items.add("이름1");

        System.out.println(items);
        // [이름3, 이름2, 이름1, 이름5, 이름4]

        Set<String> items2 = new HashSet<>();

        items2.add("1");
        items2.add("1");
        items2.add("3");
        items2.add("2");
        items2.add("5");
        items2.add("1");
        items2.add("4");

        System.out.println(items2);
        // [1, 2, 3, 4, 5]

        Set<String> items3 = new HashSet<>();

        items3.add("a");
        items3.add("c");
        items3.add("f");
        items3.add("e");
        items3.add("z");
        items3.add("h");
        items3.add("g");

        System.out.println(items3);
        // [a, c, e, f, g, h, z]
    }
}