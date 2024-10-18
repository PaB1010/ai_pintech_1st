// Class 클래스 객체 & get & set & toString

package exam01;

public class Person {

    private int age;
    private String name;

    // default 생성자
    public Person(){}

    public Person(int age, String name) {

        this.age = age;
        this.name = name;
    }

    // get & set
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // toString 재정의
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}