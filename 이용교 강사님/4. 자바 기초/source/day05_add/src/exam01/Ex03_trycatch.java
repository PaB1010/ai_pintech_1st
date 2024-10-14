// 다중 예외 (NullPointerException & ArithmethicException) try ~ catch

package exam01;

public class Ex03_trycatch {
    public static void main(String[] args) {

        try {
            String str = "abc";

            System.out.println(str.toUpperCase());
            // str = null 일시
            // NullPointerException : 참조할 주소 없음 예외

            int num1 = 10;
            int num2 = 0;

            int result = num1 / num2;
            // ArithmethicException : 0으로 나눌때

            System.out.println(result);
            // ABC

            // 예외발생시 처리가 동일할때 상위 클래스로 대체
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

//        catch (NullPointerException | ArithmeticException e) {
//
//            System.out.println(e.getMessage());
//
//        }



//        } catch (NullPointerException e) {
//
//            System.out.println(e.getMessage());
//            System.out.println("1번");
//            // Cannot invoke "String.toUpperCase()" because "str1" is null
//
//        } catch (ArithmeticException e) {
//
//            System.out.println(e.getMessage());
//            System.out.println("2번");
//        }

            System.out.println("실행 완료");

        }
}