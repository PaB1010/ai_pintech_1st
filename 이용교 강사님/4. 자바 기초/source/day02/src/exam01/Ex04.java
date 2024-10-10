package exam01;

public class Ex04 {
    public static void main(String[] args) {
        int num1 = 10;

        // 연산 순서 증가연산(++) -> 대입(=)
        int num2 = ++num1;
        // 11

        System.out.println(num2);
        // 11

        System.out.println(num1);
        // 11


        int num3 = 10;

        // 연산 순서 대입(=) -> 증가연산(++)
        int num4 = num3++;
        // 10

        System.out.println(num4);
        // 10

        System.out.println(num3);
        // 11


        // 실수 증가감소 연산
        double num5 = 10.5;

        num5++;


        System.out.println(num5);
        // 11.5
    }
}
