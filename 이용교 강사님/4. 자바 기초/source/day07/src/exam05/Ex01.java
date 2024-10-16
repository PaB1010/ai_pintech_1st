// 인스턴스 내부 클래스

package exam05;

public class Ex01 {

    public static void main(String[] args) {

        // Outer 객체 생성
        Outer out = new Outer();

        // 위에서 외부 클래스 객체(Outer)가 생성되어서
        // 인스턴스 내부 객체(Inner) 접근 가능
        Outer.Inner inner = out.new Inner();

        // 외부 클래스내의 정적 자원 접근
        System.out.println(Outer.Inner.num);

        // 인스턴스 변수인 num1은 바로 접근가능
        inner.method();
        // 30, 10
    }
}