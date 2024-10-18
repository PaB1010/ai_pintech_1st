// String 클래스 문자열 + 연산 결합
// 결합할때마다 새로운 객체 생성! (당연히 주소 변경)

package exam02;

public class Ex02 {
    public static void main(String[] args) {

        String str = "ABC";

        System.out.println(System.identityHashCode(str));
        // 1324119927

        String ABC = str;

        // 이시점에 "ABC"는 참조가 끊어지니 GC에 의해 제거됨
        str += "DEF";


        System.out.println(System.identityHashCode(str));
        // 1747585824

        String ABCDEF = str;

        System.out.println(ABC == ABCDEF);
        // false

        str += "GHI";

        System.out.println(System.identityHashCode(str));
        // 1023892928

        System.out.println(str);
        // ABCDEFGHI

        String str1 = new String("ABC");
    }
}