// Reflection API
// newInstance() 사용해 객체 생성

package exam01;

import exam01.Person;

import java.lang.reflect.Constructor;

public class Ex02 {
    public static void main(String[] args) throws Exception{

        // 생성자 조회
        Class<Person> cls = Person.class;
        // 현재 기본 생성자 메서드 정의가 없어서 예외
        // NoSuchMethodException
        Constructor defaultCon = cls.getDeclaredConstructor();

        // 기본 생성자로 객체 생성
        // (Person) -> 형변환
        Person p1 = (Person)defaultCon.newInstance();

        System.out.println(p1);
        // Person{age=0, name='null'}
        // String 타입의 default값은 null

        // 매개 변수가 있는 생성자로 객체 생성
        Constructor paramCon = cls.getDeclaredConstructor(int.class, String.class);
        Person p2 = (Person)paramCon.newInstance(20, "김이름");

        System.out.println(p2);
        // Person{age=20, name='김이름'}

        Object[] params = {30, "이이름"};
        Person p3 = (Person)paramCon.newInstance(params);

        System.out.println(p3);
    }
}