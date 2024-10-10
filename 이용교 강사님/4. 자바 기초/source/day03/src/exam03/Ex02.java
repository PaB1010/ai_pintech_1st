// 함수 정의

package exam03;

public class Ex02 {
    public static void main(String[] args) {

        // 함수 호출 (기능 실행)
        // calc(3);

        // 아래와 동일하게 출력
        System.out.println(calc(3));
        // 9

        int result = calc(3);
        System.out.println(result);
        // 9

    }

    // y값이 정수로 나올거라 int calc
    static int calc(int x) { // x = 매개 변수

        int y = x * 2 + 3;

        //y를 외부로 보내고 함수 종료
        return y;
    }
}