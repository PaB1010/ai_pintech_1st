// Exception 클래스 : 무슨 예외인지 모를때

package exam01;

public class Ex04 {
    public static void main(String[] args) {

        try {
            String str = "abc";

            System.out.println(str.toUpperCase());
            // NullPointerException : 참조할 주소 없음 예외
            // 만약 여기서 예외 발생하는데 원인 모를때 상위인 Exception 클래스

            int num1 = 10;
            int num2 = 0;

            int result = num1 / num2;
            // ArithmethicException : 0으로 나눌때

            System.out.println(result);
            // ABC

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

            // 상위 클래스(모르는 예외)는 꼭 마지막 최하단에
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}