// 오토박싱 언박싱 연산(비효율적)

package exam03;

public class Ex04 {
    public static void main(String[] args) {

        // 오토박싱
        Integer num1 = 100;
        Integer num2 = 200;

        // 언박싱 + 오토박싱
        Integer num3 = num1 + num2;
        // 연산(언박싱) num1.intValue() + num2.intValue()
        // 연산값 num3에 대입(오토박싱)

        System.out.println(num3);
    }
}