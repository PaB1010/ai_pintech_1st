package exam06;

public class Ex01 {
    public static void main(String[] args) {

        // 정적(static) 내부 클래스 바로 접근 가능
        // 객체(new 생성자 함수로 인스턴스화) 상관X
        Outer.Inner inner = new Outer.Inner();
    }
}