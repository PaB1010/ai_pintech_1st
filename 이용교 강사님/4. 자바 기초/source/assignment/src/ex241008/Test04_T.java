// 구구단을 홀수 단만 출력하도록 프로그램을 만드시오. 구현 소스

package ex241008;

public class Test04_T {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) { // 단수

            if(i % 2 == 0) { // 짝수 단일때 스킵 = 홀수 단만 출력
                continue;
            }
            
            System.out.printf("--- %d단 ---%n", i);

            for (int j = 1; j <= 9 ; j++) { // 곱해지는 수
                    System.out.printf("%d X %d = %d%n", i, j, i * j);
                }

//            ---짝수단---이 출력되기도 하고 중첩이 많아 복잡해 비효율적
//            if (i % 2 == 1) {
//
//                for (int j = 1; j <= 9 ; j++) { // 곱해지는 수
//                    System.out.printf("%d X %d = %d%n", i, j, i * j);
//                }
//
//            }
        }
    }
}
