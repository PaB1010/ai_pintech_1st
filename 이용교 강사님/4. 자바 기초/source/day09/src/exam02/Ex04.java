// Append 메서드의 return this

package exam02;

public class Ex04 {
    public static void main(String[] args) {

        // 100 byte 할당
        StringBuffer sb = new StringBuffer(100);

        /*
        // append 메서드 정의는 새로운 객체 생성이 아니라 이어쓰기라 객체의 주소가 변하지 않음
        StringBuffer sb2 = sb.append("ABC");
        StringBuffer sb3 = sb2.append("DEF");
        StringBuffer sb4 = sb3.append("GHI");

         String str = sb4.toString();
         */

        // 메서드 체이닝
        // 체인하려면 return 객체 주소
        // 본인이면 this(객체 자신의 주소)
        String str = sb.append("ABC")
                        .append("DEF")
                        .append("GHI")
                        .toString();

        System.out.println(str);

        // System.out.println(sb == sb4);
        // true


    }
}
