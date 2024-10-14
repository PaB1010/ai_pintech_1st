// 다중 예외 (NullPointerException & ArithmethicException)

package exam01;

public class Ex03 {
    public static void main(String[] args) {

        String str = "abc";

        // toUpperCase : 클래스 정의 메서드
        System.out.println(str.toUpperCase());
        // ABC

        String str2 = null;

        System.out.println(str2.toUpperCase());
        // NullPointerException : 참조할 주소 없음 예외
        
        // 이 시점에서 프로세스 중단

        int num1 = 10;
        int num2 = 0;

        int result = num1 / num2;
        // ArithmethicException : 0으로 나눌때
        
        System.out.println(result);

        System.out.println("실행 완료");

    }
}