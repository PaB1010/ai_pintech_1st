// 추상 클래스 & interface를 객체로

package exam08;

import exam02.Calculator;

public class Ex02 {

    public static void main(String[] args) {

        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 - num2;
            }
        };
    }
}