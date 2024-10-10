package exam03;

public class Ex02 {
    public static void main(String[] args) {

        int num = 1, total = 0;

        do {
            total += num;
            num++;
        } while (num <= 1);
        // 조건이 false지만 do는 이미 한번 실행됐고 반복을 멈춤
        System.out.println(total);
        // 1
    }
}