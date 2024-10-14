// try ~ catch문

package exam01;

public class Ex01_trycatch {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            // ArithmethicException = RuntimeException
            int result = num1 / num2;

            System.out.println(result);
            // 오류

        } catch (ArithmeticException e) {

            System.out.println("매우 중요한 코드 실행......");
            // 정상 출력
        }
    }
}