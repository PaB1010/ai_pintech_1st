// 상속받아 오버라이딩

package exam03;

public class SimpleCalculator extends Calculator{

    // 디폴트 생성자 & super
    public SimpleCalculator(){
        super ();
        // super ();
        // =
        // System.out.println("Calculator 생성자 호출");
    }

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}