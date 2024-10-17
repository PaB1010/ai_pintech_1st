package exam02;

import java.net.UnknownServiceException;

public class LoginService {

    public void process(String userId, String password)
    // throws UserIdValidationException, PasswordValidationException
    // RuntimeException이 아닐시 위의 코드 필수(형식 엄숙)
    {
        // 원래는 userId, password 각각 클래스 만들지만 연습이니까 한 클래스에서 같이
        // userId - user01 고정 값
        // password - 1234 고정 값


        // userId가 user01이 아닐시
        if (!userId.equals("user01")) {

            throw new UserIdValidationException("아이디가 일치하지 않습니다.");
        }

        // password가 12314가 아닐시
        if (!password.equals("1234")) {

            throw new PasswordValidationException("비밀번호가 일치하지 않습니다.");
        }
    }
}