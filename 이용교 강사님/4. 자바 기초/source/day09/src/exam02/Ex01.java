// String 선언 두가지 방법의 차이

package exam02;

public class Ex01 {
    public static void main(String[] args) {
        
        // 객체니까 힙 메모리
        String str1 = "ABC"; // 문자열 상수
        String str2 = "ABC"; // 문자열 상수
        String str3 = new String("ABC");

        // 동등성 비교 (equlas연산 default값인 값 비교)
        System.out.printf("str1.Equlas(str2) : %s%n", str1.equals(str2));
        // true

        // 동일성 비교 (주소 비교)
        System.out.printf("str1 == str2 : %s%n", str1 == str2);
        // true

        System.out.printf("str1주소 %d%n", System.identityHashCode(str1));
        // str1주소 1149319664
        System.out.printf("str2주소 %d%n", System.identityHashCode(str2));
        // str2주소 1149319664
        System.out.printf("str3주소 %d%n", System.identityHashCode(str3));
        // str3주소 284720968
    }
}
