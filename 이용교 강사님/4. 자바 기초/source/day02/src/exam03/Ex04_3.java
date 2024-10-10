package exam03;

public class Ex04_3 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 100; i += 2) {

            if (i % 2 == 1) { // 홀수만 더하기
                total += i;
            }

            // 위의 if문과 같은 값
//            if ( i % 2 == 0) {
//                continue;
//            }
            System.out.println(total);
        }
    }
}