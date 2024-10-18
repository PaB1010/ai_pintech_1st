// getClass() & getDeclared

package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex01 {
    public static void main(String[] args) {

        // 정적 상수, Class 클래스 객체
        Class<Person> cls = Person.class;

        System.out.println("---- public 생성자 ----");
        // getConstructors() = 생성자 정보 (시그니처)
        for (Constructor constructor : cls.getConstructors()) {
            System.out.println(constructor);
        }

        System.out.println("---- 모든 생성자 ----");
        for (Constructor constructor : cls.getDeclaredConstructors()) {
            System.out.println(constructor);
        }

        System.out.println("---- public 멤버 변수 ----");
        // getFields() = 멤버 변수 정보
        for (Field field : cls.getFields()) {
            System.out.println(field);
        }

        System.out.println("---- 모든 멤버 변수 ----");
        for (Field field : cls.getDeclaredFields()) {
            System.out.println(field);
        }

        System.out.println("--- public 메서드 ----");
        // getMethods() = 메서드 정보
        for (Method method : cls.getMethods()){
            System.out.println(method);
        }

        System.out.println("--- 모든 메서드 ----");
        for (Method method : cls.getDeclaredMethods()){
            System.out.println(method);
        }

        System.out.println("--- 상위 클래스의 클래스 클래스 객체 ----");
        System.out.println(cls.getSuperclass());

    }
}