// password 검증

package exam02;

public class PasswordValidationException extends RuntimeException {

    // 생성자 함수
    public PasswordValidationException(String message) {

        // super(상위클래스)로 message 넘김
        super(message);
    }
}