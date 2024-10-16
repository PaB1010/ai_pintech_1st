// ISP(Interface Segregation Principle) - 분리 원칙

package exam03;

public interface Buyer {

    // interface 상수 (static & final)
    // 상수이므로 이름 맨 앞글자 대문자 관례
    // interface 상수 앞에 public static final 컴파일러가 자동 추가
    int Num = 10;
    // interface 상수 호출시
    // Buyer.Num

    void buy();

    // default 메서드 = 인스턴스 메서드
    // 접근제어자는  public
    // 즉 하위클래스에서 객체 생성시 사용 가능
    // JDK 7
    default void order() {

        System.out.println("Buyer - 주문");

    }
    
    // private 메서드
    // 인스턴스 메서드에서 내부적으로 사용
    // JDK 9
    private void privateMethod() {
        System.out.println("private 메서드");
    }

    // static 메서드
    // 접근제어자는 public
    public static void staticMethod() {
        System.out.println("정적 메서드");
    }
}