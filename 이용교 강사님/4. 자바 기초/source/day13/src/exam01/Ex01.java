// 함수의 합성(Fucntion)

package exam01;

import java.util.function.Function;

public class Ex01 {
    public static void main(String[] args) {

        // 문자열(String)이 들어오면 문자열 길이(lenght)를 정수(Int)로 반환하는 함수
        Function<String, Integer> func1 = s -> s.length();
        // ToIntFunction<String> func1 = s -> s.length();


        // 정수(Int)가 들어오면 정수(Int)를 제곱해 반환하는 함수
        Function<Integer, Integer> func2 = x -> x * x;
        // 매개변수 & 반환값 자료형이 Int 동일해서 IntUnaryOperator
        // IntUnaryOperator func2 = x -> x * x;


        // 상단 함수 2개(fucn1 & func2)를 결합
        // 문자열 -> 정수 길이 -> 제곱
        Function<String, Integer> func3 = func1.andThen(func2);

        int result = func3.apply("ABC");
        // 3 -> 9
        // 문자열 길이 3 -> 제곱 -> 9

        System.out.println(result);
        // 9
        
        // andThen 앞에는 무조건 이미 정의된 메서드명 있어야함 (소괄호) 못함
        // Function<String, Integer> func4 = (s -> s.length).andThen(x -> x * x);
        
        // andThen 뒤는 바로 정의 가능
        Function<String, Integer> func4 = func1.andThen(x -> x * x);
    }
}