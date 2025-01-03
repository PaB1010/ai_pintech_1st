// equals()

package exam05;

public class Ex04 {
    public static void main(String[] args) {

        String s1 = new String("ABC");
        String s2 = new String("ABC");

        // 동일성 비교
        System.out.printf("s1 == s2 : 동일성 ? : %s%n", s1 == s2);
        // false

        // 동등성 비교
        System.out.printf("s1.equals(s2) : 동등성 ? : %s%n", s1.equals(s2));
        // true

        // s1 주소
        System.out.printf("s1 주소 ? : %d%n", System.identityHashCode(s1));
        // s1 주소 ? : 1149319664

        // s2 주소
        System.out.printf("s2 주소 ? : %d%n", System.identityHashCode(s2));
        // s2 주소 ? : 284720968
    }
}