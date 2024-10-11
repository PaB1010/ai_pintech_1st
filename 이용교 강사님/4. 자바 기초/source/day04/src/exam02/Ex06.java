// 메서드 영역(상수 영역)

package exam02;

public class Ex06 {
    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println(result);
        // 30

        int result2 = add(20, 30);
        System.out.println(result2);
        // 50
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }
}
