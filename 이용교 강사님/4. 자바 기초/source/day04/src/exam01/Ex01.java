// 지역변수 & main 함수와 add 메서드 함수 정의

package exam01;

public class Ex01 {
    // void = 반환값 없는 자료형 함수 끝에 return 생략되어있음
    // main 함수는 프로그램을 시작해 주는 함수로
    // 모든 함수는 main 함수(실행하는 기능)를 실행해야 실행 가능
    // 함수 총 2개, 실행 순서 main -> add
    public static void main(String[] args) {

        // main 함수의 지역 변수
        int num1 = 10;
        int num2 = 20;
        int result = add(num1, num2);

        System.out.println(result);
        // 30

    }



    // 상단 main 함수의 num1, num2와
    // 하단 add 함수의 num1, num2는
    // 함수 지역(할당받은 공간 주소)이 달라 다른 변수




    // num1, num2 = 매개 변수
    // num1, num2, result = add 함수의 지역 변수(add 함수 지역 내에서만 유의미한 변수)
    // 하지만 이 시점에서 num1, num2 != 변수, = 변수정의, =코드
    // 위에서 add 메서드 함수를 사용하여 연산 수행할때 비로소
    // 값을 담기 위해 공간을 할당받고 변수가 됨

    // 함수는 실행 절차가 나열된 코드에 불과

    // Q : 변수 선언 & 초기화시
    // 일반적인 main 함수 내에서 지역 변수와
    // for문의 매개변수에서는 int i, j; 가능했는데
    // 메서드 함수의 매개변수에서는 불가능한가요?
    // A : 절대 불가
    static int add(int num1, int num2) { // 함수 지역

        // Q : result에 노란색 밑줄 뜨는 이유
        // A : return = num1 + num2; 해서
        // 데이터 낭비하지말라고 권유하는거
        // 변수의 선언과 초기화를 동시에 (int a = 10;) 하는 원리와 비슷
        int result = num1 + num2;
        return result;

    }
}