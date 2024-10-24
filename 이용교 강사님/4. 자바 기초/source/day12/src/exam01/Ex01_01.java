// 람다식

package exam01;

import static exam01.Ex01.add2;

public class Ex01_01 {
    public static void main(String[] args) {

        /*
        int result = add2(new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        }, 10, 20);
         */

        // 람다식
        int result = add2((a, b) -> a + b, 10, 20);
    }

    public static int add2(Calculator cal, int num1, int num2) {
        return cal.add(num1, num2);
    }
}