// Stringbuffer

package exam02;

public class Ex03 {
    public static void main(String[] args) {

        // 100 byte
        StringBuffer sb = new StringBuffer(100);

        System.out.println(System.identityHashCode(sb));
        // 1324119927

        sb.append("ABC");
        System.out.println(System.identityHashCode(sb));
        // 1324119927

        sb.append("DEF");
        System.out.println(System.identityHashCode(sb));
        // 1324119927

        sb.append("GHI");
        System.out.println(System.identityHashCode(sb));
        // 1324119927

        // buffer에서 문자열로
        // 여기서 toString은 Buffer안의 객체를 비우고 색 객체 생성
        String str = sb.toString();

        System.out.println("str : " + str);
        // ABCDEFGHI

        System.out.println("str 주소 : " + System.identityHashCode(str));
        // 990368553

        String str2 = "ABCDEFGHI";

        System.out.println("str2 : " + str2);
        // ABCDEFGHI

        System.out.println("str2 주소 : " + System.identityHashCode(str2));
        // 1828972342

        // str과 str2는 값은 같지만 주소는 다른, 서로 다른 객체

        // 지양해야할 비교 == / 동일성
        System.out.printf("str == str2 : %s%n", str == str2);
        // false

        // 바람직한 비교 equals() / 동등성
        System.out.printf("str.equals(str2) : %s%n", str.equals(str2));
        // true
    }
}