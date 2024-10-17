// .toString 재정의 & equals()

package exam05;

public class Ex01 {
    public static void main(String[] args) {

        Customer c1 = new Customer(1000, "김이름", "user01@text.org");

        // System.out.println(c1.toString());
        // .toString() 컴파일러가 자동 추가
        // 문자화
        System.out.println(c1);
        // Customer에서 toString 재정의 전
        // exam05.Customer@3b07d329

        // Customer에서 toString 재정의 후
        // id= 1000, name = 김이름, email = user01@text.org

        Customer c2 = new Customer(1000, "김이름", "user01@text.org");

        // 동일성 비교
        System.out.printf("c1 == c2 : 동일성 ? : %s%n", c1 == c2);
        // false

        // 동등성 비교
        System.out.printf("c1.equals(c2) : 동등성 ? : %s%n", c1.equals(c2));
        // false
        // 즉 c1과 c2는 값이 같아도 다른 객체(주소가 다름)
        
        // equals 재정의 후 true
        // 값이 같으면 true로 재정의 했음

        // c1 주소
        System.out.printf("c1 주소 ? : %d%n", System.identityHashCode(c1));
        // c1 주소 ? : 495053715

        // c2 주소
        System.out.printf("c2 주소 ? : %d%n", System.identityHashCode(c2));
        // c2 주소 ? : 1323165413
    }
}