// 구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력하는 프로그램을 만들어 보세요.구현 소스

package ex241008;

public class Test05_T {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) { // 단수

            System.out.printf("--- %d단 ---%n", i);

            for (int j = 1; j <= 9 ; j++) { // 곱해지는 수

                if (j < i) {
                    continue;
                }

                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }

//            for (int j = 1; j <= 9; j++) { // 곱해지는 수
//                if (j >= i) {
//                    System.out.printf("%d X %d = %d%n", i, j, i * j);
//                }
//            }
        }
    }
}
