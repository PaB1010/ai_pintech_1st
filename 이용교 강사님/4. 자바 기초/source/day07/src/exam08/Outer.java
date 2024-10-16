// 추상 클래스 & interface를 객체로

package exam08;

import exam02.Calculator;

public class Outer {

    // 멤버 변수에서 미구현된 메서드를 구현 -> 객체 생성
    private static final Calculator cal = new Calculator() {
        @Override
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };

    // 지역 내부에서 미구현된 메서드를 구현 -> 객체 생성
    Calculator method(int num3) {

        // 익명 내부 클래스 (참조 변수 생략후 직접 return)
        return new Calculator() {
            
            @Override
            public int add(int num1, int num2) {

                // num3 = 20; 하면 오류 // 보이지 않는 final num3 ..

                // 지역 변수(num3)의 상수화
                // 왜? 제거 되지 않고 유지하기 위해서
                // 스택메모리에서 제거되지 않기 위해 상수화하여
                // 데이터 영역 메모리로

                return num1 + num2 + num3;
            }
        };

        /*
        // 객체니까 힙 메모리
        Calculator cal = new Calculator() {

            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        int result = cal.add(10, 20);
        System.out.println(result);
        ->
        return cal;
        */
    }
}