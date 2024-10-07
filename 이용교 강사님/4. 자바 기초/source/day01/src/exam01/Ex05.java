package exam01;

public class Ex05 {
    public static void main(String[] args) {

        // 10 = 리터럴 상수
        int num1 = 10;
        int num2 = 10;

        char ch1 = '가';
        char ch2 = '가';

        // 10이라는 값 그자체 비교 X
        // 자원이 같은 위치에 존재 하는지 체크 (주소 비교)
        System.out.println(num1 == num2);
        // true (두 리터럴 상수의 주소는 같으니까)
        System.out.println(num1 != num2);
        // false

        System.out.println(ch1 == ch2);
        // true
        System.out.println(ch1 != ch2);
        // false
    }
}
