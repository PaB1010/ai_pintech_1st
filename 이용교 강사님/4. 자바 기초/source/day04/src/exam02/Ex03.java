// 함수의 시그니쳐

package exam02;

public class Ex03 {
    public static void main(String[] args) {

        int result1 = add(10, 20); // int add(int, int)
        System.out.println(result1);
        // 30

        int result2 = add(10, 20, 30); // int add(int, int, int)
        System.out.println(result2);
        // 60

    }

    static int add(int num1, int num2) { // 함수 지역

        int result = num1 + num2;
        return result;

    }

    // 이미 정의된 함수라 오류
    // -> 함수의 시그니쳐가 동일
    // static int add(int num1, int num2){
    //     return 0;
    // }

    // 함수의 이름은 같지만 함수의 시그니쳐중 매개변수가 달라 다른 함수!
    static int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}
