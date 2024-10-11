// 변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오

package ex241008;

public class Test01_T {
    public static void main(String[] args) {

        int num1 = 20;

        //double num2 = 3; // int -> double 변환 연산 낭비
        double num2 = 3.0;

        //int result = num1 * num2; // 자료형이 달라 오류
        //double result = num1 * num2; // 오류는 안뜸


        // int result = num1 * (int)num2; // 오답
        // 데이터 유실이 일어날 수 있음
        // 예를들어 21 * (int)3.63 연산을 하면 오답으로 연산됨
        // 21 * (int)3.63 != (int)(21 * 3.63)

        int result = (int)(num1 * num2); // 정답
        System.out.println(result);
        // 60
    }
}
