package exam01;

public class Ex01 {
    public static void main(String[] args) {
        // 부호 연산자 부호 반전(-)
        int num1 = 10;

        System.out.println(-num1);
        // -10

        // 부호 연산자(-) 안쓰고 음양 반전
        int num2 = num1 * -1;

        System.out.println(num2);
        // -10

        int num3 = -num1;

        System.out.println(num3);
        // -10

        // 음수를 반전해 양수로 단항 연산
        int num4 = -num3;

        System.out.println(num4);
        // 10
    }
}
