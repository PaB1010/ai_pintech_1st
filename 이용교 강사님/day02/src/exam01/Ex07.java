package exam01;

public class Ex07 {
    public static void main(String[] args) {

        int num1 = 10;

        boolean result = num1++ > 10 && (num1 = num1 + 20) > 20;

        System.out.println(result);
        // false

        // 단락 회로 평가 : 논리 연산에서 이미 값이 결정된 경우 다음 항 연산 X

        // 이미 && 좌측에서 false값이 나와서
        // && 우측 값은 연산이 안돼서 num1++에서 연산 종료
        System.out.println(num1);
        // 11

        int num2 = 10;

        // 단락 회로 평가
        // 이미 || 좌측에서 true 나와서 연산 종료
        boolean result2 = ++num2 > 10 || (num2 = num2 + 20) < 30;

        System.out.println(num2);
        // 11

        int num3 = 10;

        // 단락 회로 평가 X
        // || 좌측이 false라서 || 우측까지 연산 진행
        boolean result3 = ++num3 > 11 || (num3 = num3 + 20) < 30;

        System.out.println(num3);
        // 31


    }
}