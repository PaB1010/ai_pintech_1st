// 다중상속 불가

package exam01.review;

public class Ex01 {

    public static void main(String[] args) {

        Calculator cal = new SimpleCalculator();

        // 만약 다중상속이 가능하다면
        // method가 Calculator의 자원인지 Calculator2의 자원인지
        // 불확실해서 JAVA는 다중속성 불가능
        cal.method();

    }
}