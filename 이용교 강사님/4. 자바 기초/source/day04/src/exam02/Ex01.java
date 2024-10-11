// 참조 변수 & 참조 자료형

package exam02;

public class Ex01 {
    public static void main(String[] args) {


        // 힙
        // Student s1에서 Student = 자료형, s1 = 지역, 참조 변수(스택 메모리)
        // s1 = 힙에 있는 id, name, major의 주소를 값으로 가짐
        // -> 왜? 주소를 참조해 객체를 사용하기 위해
        // Ex) s1(우리집) = 힙영역의 주소(인천시 계양구 ...)
        // new Student() = 생성자 함수(객체 생성)
        Student s1 = new Student();
        s1.id = 1000;
        s1.name = "최이름";
        s1.major = "실용음악";
        s1.showInfo();

        // 힙에 있는 s1의 주소 출력
        System.out.println("s1 : " + System.identityHashCode(s1));
        // s1 : 932172204
        // 여기서 출력되는 정수값은 가상의 주소
        // C언어는 진짜 메모리 주소로 출력
        // 참조 자료형이 모두 4바이트인 이유
        // -> 주소값인 정수를 담기에는 4바이트면 충분

        // 힙 메모리와 연결된 주소 값이 비워짐
        // 즉, 연결(참조)이 끊어짐
        // Q : 함수를 모두 사용하고 return해 값 반환후 종료하는 원리와 같은?
        // A :
        s1 = null;

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "김이름";
        s2.major = "무용";
        s2.showInfo();

        // 힙에 있는 s2의 주소 출력
        System.out.println("s2 : " + System.identityHashCode(s2));
        // s2 : 521645586

        // s2의 변수(id, name등) 값 대입 X
        // s2의 주소값 대입 O
        // 배열에서 했던것과 같은 원리 (배열 시작 지점의 주소)
        Student s3 = s2;
        s3.name = "(수정)김이름";
        
        s3.showInfo();
        // name = (수정)김이름
        s2.showInfo();
        // name = (수정)김이름, s3에서 name을 새로 대입해서

        System.out.println("s3 : " + System.identityHashCode(s3));
        // s3 : 521645586, s2와 같은 주소값

        // s2와 s3의 주소 비교
        System.out.println("s2, s3의 주소 : " + (s2 == s3));
        // true (같다)

        // s1과 s2의 주소 비교
        System.out.println("s1, s2의 주소 : " + (s1 == s2));
        // false (다르다)
    }
}