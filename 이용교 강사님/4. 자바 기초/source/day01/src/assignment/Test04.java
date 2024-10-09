// 구구단을 홀수 단만 출력하도록 프로그램을 만드시오. 구현 소스

package assignment;

public class Test04 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i+=2) {

            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
    }
}