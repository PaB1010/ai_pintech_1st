// System.out

package exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex17 {
    public static void main(String[] args) throws Exception {

        /*
        // 한글은 아스키코드로 변환되는 문제
        char ch = (char)System.in.read();
        System.out.println(ch);
         */

        // 한글 안깨지고 Buffer 기능 추가
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char ch = (char)br.read();

        System.out.println(ch);
    }
}