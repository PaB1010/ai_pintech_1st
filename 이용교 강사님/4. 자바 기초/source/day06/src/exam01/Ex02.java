// A 클래스 상속받은 B 클래스 상속받은 C 클래스 객체 사용

package exam01;

public class Ex02 {
    public static void main(String[] args) {

        C c = new C();
        // 콘솔 출력 값
        // A 생성자
        // B 생성자
        // C 생성자
        
        
        // A, B, C 클래스의 모든 객체 사용 가능
        System.out.println(c.numA);
        System.out.println(c.numB);
        System.out.println(c.numC);
    }
}