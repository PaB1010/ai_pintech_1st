// random 정수가 홀수인 것중 처음 값을 가져오는

package exam01;

import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {

        Random random = new Random();

        // ints() 무한 스트림
        // 찾지 못했으면 -1
        int odd = random.ints().filter(x -> x % 2 == 1).findFirst().orElse(-1);

        System.out.println(odd);

    }
}