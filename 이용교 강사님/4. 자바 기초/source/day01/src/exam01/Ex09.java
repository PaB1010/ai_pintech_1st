package exam01;

public class Ex09 {
    public static void main(String[] args) {
        byte num1 = 100; // 1byte

        // byte -> int 자료형 변환 (공간이 충분해 자료 손실 X)
        // 자동 형변환(=묵시적 형변환) : 작은 자료형 -> 큰 자료형
        int num2 = num1;

        System.out.println(num2);
        // 100
    }
}
