// 사용자 정의 Annotation의 Class 클래스 객체

package exam02;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) throws Exception{

        // 클래스 위에 적용된 Annotatioin 정보 확인 S

        // 정적 상수로 Student의 Class 클래스 객체 접근
        Class<Student> cls = Student.class;

        // JVM에서 구현한 완전한 객체 조회
        MyAnno myAnno = cls.getAnnotation(MyAnno.class);

        // 반환값(value())의 구현 확인
        String[] value = myAnno.value();

        // 설정 한개일때는 [] 생략
        // String value = myAnno.value();

        System.out.println(Arrays.toString(value));
        // [여기는 클래스, 여기는 Student 클래스]

        // 설정 한개일때는 Arrays.toString() 사용 필요 X
        // System.out.println(Arrays.toString(value));

        // 구현체 생성
        int min = myAnno.min();
        int max = myAnno.max();

        System.out.printf("min = %d, max = %d%n", min, max);
        // min = 10, max = 100

        // 클래스 위에 적용된 Annotatioin 정보 확인 E



        // 메서드 위에 적용된 Annotation 정보 확인 S

        // 연습이라 임시로 Throws Exception
        Method method = cls.getDeclaredMethod("study");
        
        // 메서드 위에 적용된 Annotation 정보 확인
        MyAnno myAnno2 = method.getAnnotation(MyAnno.class);

        String[] value2 = myAnno2.value();

        System.out.println(Arrays.toString(value2));
        // [여기는 메서드, 여기는 study 메서드]

        int min2 = myAnno2.max();
        int max2 = myAnno2.min();

        // default 예약어 값 출력 확인
        System.out.printf("min2 = %d, max2 = %d%n", min2, max2);
        // min = 10, max = 1

        // 메서드 위에 적용된 Annotation 정보 확인 E
    }
}
