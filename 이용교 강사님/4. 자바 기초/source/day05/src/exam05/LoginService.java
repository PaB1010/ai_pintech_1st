// static singleton 패턴
// LoginService 객체를 한개만 만들 수 있도록 통제
// login 기능 → 관례적으로 service

package exam05;

public class LoginService {

    // 2. 기본 생성자가 private라서 클래스내에 객체 생성
    // private static LoginService instance = new LoginService();
    private static LoginService instance;

    // 1. 기본 생성자 private
    private LoginService() {}

    // 3. 외부에서 접근 가능하드록 정적(static) 메서드 생성
    public static LoginService getInstance() {

        if (instance == null) {
            instance = new LoginService();
        }

        return instance;
    }

    public void login(String userId, String password) {

    }
}