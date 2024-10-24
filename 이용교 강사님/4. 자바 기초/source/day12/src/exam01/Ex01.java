// interface → 객체(참조변수) 후 매개변수로 사용

package exam01;

public class Ex01 {
    public static void main(String[] args) {

        // cal은 참조 변수(주소값), 객체
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        int result = add2(cal, 10, 20);
        System.out.println(result);
        // 30
    }

    // cal은 값이므로 매개 변수 가능
    public static int add2(Calculator cal, int num1, int num2) {

        return cal.add(num1, num2);
    }
}