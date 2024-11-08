// 직렬화

package exam02;

import java.io.Serializable;

// Serializable = 비어있는 Interface
// 단순 의사 전달용
// Maker Interface

public class Person implements Serializable {

    // 버전 수동 관리
    private static final long serialVersionUID = 1000L;

    private String name;
    // transient = 직렬화 배제 (민감한 데이터 전송 방지)
    private transient int age;

    private String job;
    /*
    private String job;

    버전 오류
    serialVersionUID = 7265183754798596724
     */

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.printf("name2 = %s / age = %d%n", name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}