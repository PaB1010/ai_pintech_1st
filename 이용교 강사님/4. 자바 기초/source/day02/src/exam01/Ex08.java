package exam01;

public class Ex08 {
    public static void main(String[] args) {

        int num = 10;

        num /= 3;

        System.out.println(num);
        // 3 (int기 때문에 소수점 아래가 절삭되어 정수로 출력)

        // 뒤에 D 안붙여도 값이 실수로 나옴
        double num2 = 10;

        num2 /= 3;

        System.out.println(num2);
        // 3.333333

    }
}
