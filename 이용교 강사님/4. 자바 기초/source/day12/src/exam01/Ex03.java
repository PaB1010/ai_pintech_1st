// 매개변수 1개일때 람다식

package exam01;

public class Ex03 {
    public static void main(String[] args) {

        /*
        MyLambda my = (s) -> System.out.println(s);

        // 매개변수 1개일때는 () 생략 가능
        MyLambda my2 = s -> System.out.println(s)
         */

        // 매개변수가 없는 경우 () 생략 불가
        MyLambda my3 = () -> System.out.println("출력");
        my3.print();

    }
}