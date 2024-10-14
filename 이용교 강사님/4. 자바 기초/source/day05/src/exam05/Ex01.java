// static singleton 패턴

package exam05;

public class Ex01 {
    public static void main(String[] args) {

        // LoginService s1 = new LoginService();
        // LoginService s2 = new LoginService();

        // System.out.println(s1 == s2);
        // false, s1과 s2는 다른 객체

        LoginService s1 = LoginService.getInstance();
        LoginService s2 = LoginService.getInstance();

        System.out.println(s1 == s2);
        // true, 같은 주소
    }
}