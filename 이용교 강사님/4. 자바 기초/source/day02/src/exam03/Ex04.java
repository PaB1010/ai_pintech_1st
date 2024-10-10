// 50회만 반복하고 break하는 for문

package exam03;

public class Ex04 {
    public static void main(String[] args) {

        int total = 0;

        for (int i = 1; i <= 100; i++) {
            total += i;

            // 비효율적 반복 중단
            if (i == 50) {
                break;
            }
        }
        System.out.println(total);
    }
}
