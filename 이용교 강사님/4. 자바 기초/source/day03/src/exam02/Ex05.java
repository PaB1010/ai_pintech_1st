// 자료형의 초기 기본값

package exam02;

public class Ex05 {

    static int num1;
    static double num2;
    static boolean result;

    // 참조형 자료형
    static String str;

    public static void main(String[] args) {

        System.out.println(num1);
        // 0

        System.out.println(num2);
        // 0.0

        System.out.println(result);
        // false (0이 false이기 때문)

        System.out.println(str);
        // null (참조형 자료형은 기본값이 null이기 때문)
    }
}
