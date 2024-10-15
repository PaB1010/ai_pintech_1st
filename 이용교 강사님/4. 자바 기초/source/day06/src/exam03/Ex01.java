package exam03;

public class Ex01 {
    public static void main(String[] args) {

//        interface 클래스에서 많이 사용하는 방식?

//        Calculator cal = new Calculator() {
//            @Override
//            public int add(int num1, int num2) {
//                return num1 + num2;
//            }
//        };
//
//        int result = cal.add(10, 20);
//        System.out.println(result);
//
//        System.out.println(cal.num);



        // 상속의 다형성 적용한 통상적 관례
        Calculator cal = new SimpleCalculator();
        // =
        // SimpleCalculator cal = new SimpleCalculator();

        // SimpleCalculator의 add 메서드
        int result = cal.add(10, 20);
        System.out.println(result);

        System.out.println(cal.num);
    }
}
