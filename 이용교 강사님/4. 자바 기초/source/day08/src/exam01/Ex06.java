package exam01;

public class Ex06 {
    public static void main(String[] args) {

        try (MyResource r1 = new MyResource();
        MyResource2 r2 = new MyResource2()) {

        } catch (Exception e) { }

        // try - with - resources
        // 구문 실행 완료 (예외가 있던 없던)

        // AutoCloseable
        // -> 인터페이스 구현체인가? 자원 해제 객체 판별 기준
        // AutoCloseable c1 = r1;
        // 형번환 가능 (다형성) : 기준에 충족
        // instacneof AutoClseable = true
    }
}