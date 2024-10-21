// 사용자 정의 Annotation 사용

package exam02;

// class 위

// 기본 value 속성 하나면 value = 생략 가능
// @MyAnno(value = "여기는 클래스")
// @MyAnno({"여기는 클래스", "여기는 Student 클래스"}

@MyAnno(value = {"여기는 클래스", "여기는 Student 클래스"},max = 100,min = 10)
public class Student {

    // @MyAnno(value = {"여기는 메서드", "여기는 study 메서드"},max = 10,min = 1)
    // default 설정 완료
    @MyAnno({"여기는 메서드", "여기는 study 메서드"})
    public void study(){}
}