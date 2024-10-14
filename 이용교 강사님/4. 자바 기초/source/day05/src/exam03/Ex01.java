package exam03;

public class Ex01 {
    public static void main(String[] args) {

        // num1이 default지만 같은 패키지라 접근 가능
        // num2는 public
        A a = new A();
        
        // 클래스 외부
        a.num1 = 10;
        
        // 클래스 외부
        a.num2 = 20;
        
        // num3은 private라서 접근 불가
        // a.num3 = 30;

        // 인스턴스 메소드 -> 객체 생성 이후 객체의 참조 변수를 통해서만 호출 가능
        a.method();
        // 100
    }
}
