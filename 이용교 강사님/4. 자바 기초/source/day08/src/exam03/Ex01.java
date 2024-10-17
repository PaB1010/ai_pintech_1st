// java.lang 패키지

package exam03;

// 여태 String, int등은 어떻게 그냥 써왔을까?
// 컴파일러가 자동 import 해줘서
// import java.lang.*;

// 위에 포함되니 불필요
// import java.lang.String;

// extends java.lang.Object 자동 추가
// public class Ex01 extends java.lang.Object
// =
public class Ex01 {
    public static void main(String[] args) {

        // String 클래스 풀네임 = java.lang.String
        String str = "안녕하세요";

    }
}