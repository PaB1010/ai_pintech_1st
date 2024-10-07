package exam01;

public class Ex10 {
    public static void main(String[] args) {

        int num1 = 100000000;

        // int -> float 자동 형변환 (정수 -> 실수)
        float num2 = num1;

        long num3 = 10000000000000L; // 8byte

        // long -> float
        // long은 8byte고 float은 4byte지만
        // 모든 실수는 모든 정수를 포함 가능
        float num4 = num3;
    }
}
