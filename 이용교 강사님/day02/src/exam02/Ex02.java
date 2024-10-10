package exam02;

public class Ex02 {
    public static void main(String[] args) {

        int age = 17;

        if (age < 8) {
            System.out.println("유치원생");
            // else if ( age =< 8 && age < 14 )이 아닌가?
            // 이미 age < 8이 false인 상태라 연산이 넘어온거라
            // age < 14 만 조건식에 써도 됨
        } else if (age < 14) { // age >= 8 && age < 14
            System.out.println("초등학생");
        } else if (age < 17) { // age >= 14 && age < 17
            System.out.println("중학생");
        } else if (age < 20) { // age >= 17 && age < 20
            System.out.println("고등학생");
        } else { // age >= 20
            System.out.println("성인");
        }
    }
}