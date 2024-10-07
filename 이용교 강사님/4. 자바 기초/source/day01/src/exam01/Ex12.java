package exam01;

public class Ex12 {
    public static void main(String[] args) {
        int num1 = 1000;

        // byte num2 = num1;
        // 데이터 유실이 일어나는 형태라 오류

        // 명시적 형변환 : (byte)로 변환한다고 명시
        byte num2 = (byte)num1;

        System.out.println(num2);
        // -24
        // 1000에서 값이 변조되어있음

        int num3 = 100;

        // byte num4 = num3;
        // 100은 작은 값이라 될것 같아도 자료형이 달라 오류

        byte num4 = (byte)num3;

        System.out.println(num4);
        // 100
    }
}
