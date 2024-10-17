// try - catch - finally문

package exam01;

public class Ex01 {
    public static void main(String[] args) {

        try {

            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println(result);
            System.out.println("정상 실행 Try");

        } catch (ArithmeticException e) {

            e.printStackTrace();
            System.out.println("예외 발생 Catch");

        } finally {

            System.out.println("무조건 실행되는 코드 Finally");
            
        }

    }
}
