// Arithmethic 예외

package exam01;

public class Ex01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        // ArithmethicException = RuntimeException
        int result = num1 / num2;

        System.out.println(result);
        // 오류
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at exam01.Ex01.main(Ex01.java:7)
        // 종료 코드 1(으)로 완료된 프로세스 -> 종료코드 1 = 비정상

        System.out.println("매우 중요한 코드 실행......");
        // 상단의 오류때문에 프로세스가 중단되어 정상 출력되지 않음
    }
}