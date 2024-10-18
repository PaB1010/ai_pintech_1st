// Integer 비권장 이유

package exam03;

public class Ex05 {
    public static void main(String[] args) {

        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);

        System.out.printf("num1 주소 : %d%n", System.identityHashCode(num1));
        // num1 주소 : 1324119927
        System.out.printf("num2 주소 : %d%n", System.identityHashCode(num2));
        // num2 주소 : 284720968

        // Integer 비권장 이유 : 주소가 다르게 나와서
    }
}