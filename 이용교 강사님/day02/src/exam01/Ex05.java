package exam01;

public class Ex05 {
    public static void main(String[] args) {

        int num1 = 10;

        int result = num1++ + 5;
        // 선 대입 후 증감
        // num1 + 5 ->  num1++

        System.out.println(result);
        // 15

        int result2 = ++num1 + 5;
        // 8열에서 ++된 num1 = 11
        // 선 증감 후 대입
        // ++num1 -> + 5

        System.out.println(result2);
        // 17
    }
}
