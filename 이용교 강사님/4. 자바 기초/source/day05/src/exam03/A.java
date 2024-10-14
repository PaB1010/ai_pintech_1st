package exam03;

public class A {
    
    // default -> 같은 패키지 내에서만 접근 가능
    int num1;

    // public -> 다른 패키지도 접근 가능
    public int num2;

    // private -> 같은 public class A클래스 내부에서만 접근 가능
    private int num3;


    // default + 상속을 통한 외부 패키지 범위 클래스의 private
    protected int num4;

    // 대입은 객체가 만들어진 후에 이루어져서
    // 이시점에선 아직 변수 정의일뿐 변수가 아님
    private int num6 = 200;

    // 인스턴스 메서드 -> 객체 생성 이후 객체의 참조 변수를 통해서만 호출 가능
    // method 라는 인스턴스 메서드가 실행될 때는 이미 객체가 생성된 후
    public void method() { // 클래스 내부 - 클래스 내에 정의된 메서드 정의 내부
        // 이미 num3은 인스턴스 변수
        num3 = 100;
        System.out.println(num3);
    }
}


// default 클래스
// class C {
    // 여기선 A클래스의 private인 num3은 사용 불가
// }