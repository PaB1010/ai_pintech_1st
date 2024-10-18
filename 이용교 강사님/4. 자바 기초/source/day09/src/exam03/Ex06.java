// Integer.valueOf() 권장 이유

package exam03;

public class Ex06 {
    public static void main(String[] args) {

        // byte 범위의 숫자 내에서는 동일 객체를 공유
        // 그 이상의 숫자인 경우는 새로운 객체 생성
        Integer num1 = Integer.valueOf(10);
        Integer num2 = Integer.valueOf(10);

        System.out.printf("num1 주소 : %d%n", System.identityHashCode(num1));
        // num1 주소 : 1324119927
        System.out.printf("num2 주소 : %d%n", System.identityHashCode(num2));
        // num2 주소 : 1324119927

        // 주소 값이 같음

        // byte 범위를 벗어나 숫자가 커지면 새로운 객체 생성
        Integer num3 = Integer.valueOf(1000);
        Integer num4 = Integer.valueOf(1000);

        System.out.printf("num3 주소 : %d%n", System.identityHashCode(num3));
        // num3 주소 : 284720968
        System.out.printf("num4 주소 : %d%n", System.identityHashCode(num4));
        // num4 주소 : 189568618
    }
}