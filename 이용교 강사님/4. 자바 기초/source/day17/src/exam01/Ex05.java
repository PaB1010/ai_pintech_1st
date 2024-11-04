// Arrays.sort (정렬)

package exam01;

import java.util.Arrays;
import java.util.Comparator;

public class Ex05 {
    public static void main(String[] args) {

        String[] words = {"이름3", "이름2", "이름1", "이름5", "이름4"};

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));
        // [이름1, 이름2, 이름3, 이름4, 이름5]
        // Natural Order (정순)

        Arrays.sort(words, Comparator.reverseOrder());
        System.out.println(Arrays.toString(words));
        // [이름5, 이름4, 이름3, 이름2, 이름1]
        // reverseOrder (역순)
    }
}