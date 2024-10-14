// import +auto

package exam04;

// exam03에 포함된 모든 클래스
// import exam03.*;

import exam03.A;

public class Ex01 {
    public static void main(String[] args) {

        // import 없을시 B 클래스는 default라서 접근불가로 오류
        // B b = new B();

        // 패키지명 직접 명시시 import 없이도 사용 가능
        exam03.B b2 = new exam03.B();

        // import했기 때문에 접근 가능
        A a = new A();

        // num1은 default라서 접근 불가
        // a.num1 = 5;

        // num2는 public으로 접근 가능
        a.num2 = 1;
    }
}