package exam01;

public class Ex06 {
    public static void main(String[] args) {

        System.out.println(10 > 5);
        // true

        boolean result1 = 10 > 5;

        System.out.println(result1);
        // true

        int num1 = 5;

        boolean result2 = num1 >= 10;

        System.out.println(result2);
        // false

        boolean result3 = num1 < 100;

        System.out.println(result3);
        // true

        boolean result4 = result2 && result3;
        System.out.println(result4);
        // false
        // result2가 false이기 때문

        // 이편이 데이터 낭비가 덜하고 용이
        // 선 비교연산(>=, <) 후 논리연산(&&)
        boolean result5 = num1 >= 10 && num1 < 100;
        System.out.println(result5);
        // false

        System.out.println(result2 == result3);
        // false

    }
}
