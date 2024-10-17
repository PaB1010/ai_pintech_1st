package exam05;

public class Ex03 {
    public static void main(String[] args) {

        Customer2 c1 = new Customer2(1000, "이이름", "user01@test.org");

        // c1.toString()
        System.out.println(c1);
        // Customer2[id=1000, name=이이름, email=user01@test.org]

        // 개별 조회
        // Recode 클래스의 멤버변수는 메서드
        System.out.printf("id = %d, name = %s, email = %s%n", c1.id(), c1.name(), c1.email());

    }
}