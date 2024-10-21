// 사용자 정의 Annotatin 클래스(인터페이스의 하위 클래스) 정의
// Annotatin 클래스

package exam02;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 적용 대상 : TYPE - 클래스명 위, METHOD - 메서드 위
@Target({ElementType.TYPE, ElementType.METHOD})
// 99% RUNTIME 사용
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {

    // 추상 메서드 (추가 정보 전달)
    // default 설정 항목
    // 클래스에서 (설정한 내용)을 반환 값으로
    // [] 기호를 넣음으로서 여러 값 가능
    String[] value();

    // 설정 항목 추가 (추상메서드)
    // default 예약어 사용으로 구현시 기본 값 1
    int min() default 1;

    // 설정 항목 추가 (추상메서드)
    // default 예약어 사용으로 구현시 기본 값 10
    int max() default 10;

}