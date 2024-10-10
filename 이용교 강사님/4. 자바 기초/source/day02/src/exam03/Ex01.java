package exam03;

public class Ex01 {
    public static void main(String[] args) {

        // num, total 모두 같은 int 자료형
        // 동일 자료형이면 나열식으로 변수 선언과 초기화 가능
        int num = 1, total = 0;
        // num : 반복에 대한 초기값 (증감식 필수)
        // total :

        while (num <= 100) { // 조건식

            // 복합 대입 연산자
            total += num;
            // total = total + num;

            // 증가감소 연산자, ++num; 동일
            num++;
            // num = num + 1;
        }
        System.out.println(total);
        // 5050
    }
}
