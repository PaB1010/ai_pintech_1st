// 생성자 오버로드(메서드 오버로드)

package exam02;

public class Ex05 {
    public static void main(String[] args) {

        Student s1 = new Student(1001, "박이름", "영어");

        Student s2 = new Student(1002, "유이름", "수학");

        Student s3 = new Student();

        Ex04 e1 = new Ex04(1003, "이르음","과학");

        s1.showInfo();
        s2.showInfo();
        e1.showInfo();

        // Class 클래스 객체
        Class cls = Student.class;
    }
}