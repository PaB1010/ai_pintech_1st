// invoke() 아는 것이 불확실할때 동적 메서드 호출

package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Ex03 {
    public static void main(String[] args) throws Exception {

        Class<Person> cls = Person.class;

        Constructor con = cls.getConstructor();

        // 객체 생성
        Object obj = con.newInstance();

        // (메서드명, 매개변수명)
        Method m1 = cls.getDeclaredMethod("setAge", int.class);
        Object r1 = m1.invoke(obj, 20);
        System.out.println(r1);
        // null

        Method m2 = cls.getDeclaredMethod("getAge");
        Object r2 = m2.invoke(obj);
        int age = (int)r2;
        System.out.println(r2);
        // 20
        System.out.println(age);
        // 20
        System.out.println(obj);
        // Person{age=20, name='null'}
    }
}