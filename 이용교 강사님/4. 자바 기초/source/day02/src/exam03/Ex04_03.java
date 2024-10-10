// 1~100중 50만 빼고 더하는 반복문

package exam03;

public class Ex04_03 {
    public static void main(String[] args) {

        int total = 0;

        for (int i = 1; i <= 100; i++) {

            if (i == 50) {
                continue;
                // 현재 반복 중단, 새로 반복 시작(건너뛰기)
            }

            total += i;


        }
        System.out.println(total);
        // 5000
    }
}
