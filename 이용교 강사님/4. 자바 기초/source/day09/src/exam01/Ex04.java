// 동적 로드 Class.forName

package exam01;

public class Ex04 {
    // 연습하려고 fileNotFound throws
    public static void main(String[] args) throws ClassNotFoundException{

        // 실행 과정 중에 로딩한다는 가정하
        Class cls = Class.forName("exam01.Person");

        // 동적 로딩
        System.out.println(cls);

    }
}