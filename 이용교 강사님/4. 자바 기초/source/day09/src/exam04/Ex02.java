// java.lang.Enum

package exam04;

public class Ex02 {
    public static void main(String[] args) {

        Transportation trans = Transportation.SUBWAY;

        // java.lang.Enum의 하위 클래스임을 체크
        
        // 1. instanceof 연산
        System.out.println(trans instanceof Enum);
        // true
        
        // 2. 다형성 확인
        Enum<Transportation> trans2 = trans;
    }
}