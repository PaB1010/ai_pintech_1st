package exam01.review;

public class Ex01 {
    public static void main(String[] args) {

        // s1 = main 함수의 지역변수로 Student 클래스의 주소를 반환값(4byte)으로 가짐
        Student s1 = new Student();

        s1.name = "김이름";
        s1.id = 1;
        s1.major = "경영";

        s1.showInfo();

    }
}