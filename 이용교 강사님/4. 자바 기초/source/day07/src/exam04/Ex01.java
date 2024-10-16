package exam04;

public class Ex01 {
    public static void main(String[] args) {

        D d = new D();

        // D의 common 메서드가 호출됨
        // 가장 중요한 메서드의 구현 내용{}(실행 코드)이 D에 있음
        // 가상 메서드 영역!
        // 구현 내용{}(실행 코드)이 없고 정의한 틀만 있는
        // A, B의 common이 호출될 가능성은 0%
        // 즉 구현 내용{}(실행 코드)이 있는 defulat 메서드는 예외
        d.common();
    }
}