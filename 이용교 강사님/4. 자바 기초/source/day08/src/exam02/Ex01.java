// Login

package exam02;

public class Ex01 {
    public static void main(String[] args) {

        LoginService service = new LoginService();
        
        // RuntimeException시 try - catch문 생략 가능
        // 왜? 예외 처리를 하지 않아도 컴파일되기 때문
        // 예외 처리를 생략하는 것

         try {

            service.process("user021", "12334");

            System.out.println("로그인 성공");

        } catch (UserIdValidationException | PasswordValidationException e) {

            System.out.println(e.getMessage());

        }
    }
}