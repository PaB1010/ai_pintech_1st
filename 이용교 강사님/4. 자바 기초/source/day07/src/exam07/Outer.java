// 지역 내부 클래스

package exam07;

public class Outer {

    // 지역 (함수 지역)
    void method() {

        // 지역 내부 클래스 -> 함수(method) 지역 내부
        class Inner {

            int add(int num1, int num2) {
                return num1 + num2;
            }
        }

        // 지역 외부!! -> 함수(method) 지역 외부
        Inner in = new Inner();

        int result = in.add(10, 20);

        System.out.println(result);
    }
}