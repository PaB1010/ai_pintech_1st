package exam02;

public class Ex01 {
    public static void main(String[] args) {

        // 상속과 마찬가지로 다형성 적용
        // SimpleCalculator cal = new SimpleCalculator();
        Calculator cal = new SimpleCalculator();

        int result = cal.add(10, 20);

        System.out.println(result);

    }
}