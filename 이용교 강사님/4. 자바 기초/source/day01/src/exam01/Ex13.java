package exam01;

public class Ex13 {
    public static void main(String[] args) {
        double num1 = 10.123;

        // int num2 = num1;
        // 데이터 유실이 일어나는 형태라 오류

        // 명시적 형변환 : (int)로 변환한다고 명시
        int num2 = (int)num1;

        System.out.println(num2);
        // 10
        // 소수점 데이터가 유실되어 10으로 데이터 변환
    }
}
