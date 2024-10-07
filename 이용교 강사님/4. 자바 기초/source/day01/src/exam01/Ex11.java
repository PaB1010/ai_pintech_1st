package exam01;

public class Ex11 {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 3.0;

        // int -> double 연산중 자동 형변환

        System.out.println(num1 + num2);
        // 13.0

        // int result = num1 / num2;
        // 연산된 값은 double이기때문에 오류

        double result = num1 / num2;

        System.out.println(result);
        // 3.33333333

        byte num3 = 1;

        // byte -> int 연산중 자동 형변환
        int result2 = num1 - num3;

        System.out.println(result2);
        // 9


    }
}
