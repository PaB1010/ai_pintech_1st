// 추상 클래스 & interface를 객체로

package exam08;

import exam02.Calculator;

public class Ex01 {
    public static void main(String[] args) {

        Outer out = new Outer();

        // Outer의 method 메서드의 지역 변수인 cal이
        // 여기서 !참조!되므로 method 함수 연산이 끝났지만
        // cal은 힙 메모리에서 GC에게 제거당하지않음
        Calculator cal = out.method(30);

        int result = cal.add(10, 20);
        System.out.println(result);
        // 60 (10 + 20 + 30)

    }
}