package exam03;

public class Ex01_2 {
    public static void main(String[] args) {

        // num, total 모두 같은 int 자료형
        // 동일 자료형이면 나열식으로 변수 선언과 초기화 가능
        int num = 200, total = 0;

        while (num <= 100) { // false 이므로 반복문 실행 X

            // 복합 대입 연산자
            total += num;
            // total = total + num;

            // 증가감소 연산자, ++num; 동일
            num++;
            // num = num + 1;
        }
        System.out.println(total);
        // 0
    }
}
