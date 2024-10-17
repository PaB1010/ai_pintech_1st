// catch 없는 catch - try - finally문

package exam01;

public class Ex02 {
    public static void main(String[] args) {

        add(10,20);

    }

    // main이 static이라서 return 하려면 똑같이 static 이어야 가능
    public static int add(int num1, int num2) {
        try {
            System.out.println("return 직전 실행 코드");

            // return 해도 finally는 실행
            return num1 + num2;

            // return 후 사용하려면 원래 오류
            // System.out.println("return 직후 실행 코드");

        } finally {
            System.out.println("무조건 실행 Finally");
        }
    }
}