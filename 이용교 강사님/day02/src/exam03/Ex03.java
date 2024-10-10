// for문을 이용한 1부터 100까지 더하는 반복문

package exam03;

public class Ex03 {
    public static void main(String[] args) {

        int total = 0;

        // 한줄에 변수 여러개 선언 가능
        for (int i = 1, j = 10; i <= 100; i++, j--) {
            // i <= 100이 참일때 실행되는 코드
            total += i;
            System.out.println(j);
        }
        System.out.println(total);
        // 5050
    }
}
