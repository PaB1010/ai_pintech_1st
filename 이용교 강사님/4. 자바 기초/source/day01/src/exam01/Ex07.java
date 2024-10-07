package exam01;

public class Ex07 {
    public static void main(String[] args) {
        // 모든 정수를 처음에는 주로 사용하는 자료형인 int로 인식, 아니면 long으로 변경

        //int num1 = 10000000000000;
        //java: integer number too large

        // long num1 = 10000000000000;
        // int로 인식해 오류

        // 값 뒤에 L을 붙여 처음부터 long 자료형으로 인식시킴
        long num1 = 10000000000000L;

        // 가독성을 위해 0 3개마다 _로 절단
        long num2 = 10_000_000_000_000L;

        // int 100 -> byte 변환
        // 2번 연산하므로 비효율적
        byte num3 = 100;
    }
}
