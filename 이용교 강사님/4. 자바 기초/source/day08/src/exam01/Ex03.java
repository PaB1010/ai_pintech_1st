// close 함수 사용 자원해제(JDK 7 이전 구문법)

package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {

        // try & catch문 어디서든 fis 변수명을 사용하기 위해
        // 지역 외부에서 null 값 대입해 선언
        FileInputStream fis = null;

        try {

            // FileInputStream fis = new FileInputStream("a.txt");
            // catch 지역내에서도 fis 변수명 사용하기 위해

            fis = new FileInputStream("b.txt");


            // 자원 해제 -> close 메소드
            fis.close();
            System.out.println("자원 해제 Close");

        // FileNotFoundException의 하위 클래스인 IOException으로 형변환
        } catch (IOException e) {

            e.printStackTrace();

            if (fis != null) {
                try {
                    // 자원 해제 -> close 메소드
                    fis.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            System.out.println("자원 해제 Close");
        }
    }
}