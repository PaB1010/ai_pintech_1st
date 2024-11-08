// FileInputStream (a.txt)

package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {


        // a.txt = ABCD
        try (FileInputStream fis = new FileInputStream("a.txt")) {

            // read() 반환 값은 int
            // 1Byte 읽기
            int ch = fis.read();

            System.out.println(ch);
            // 65 (아스키 코드)
            System.out.println((char)ch);
            // A

            ch = fis.read();
            System.out.println((char)ch);
            // B (read()의 FilePointer가 이동해 A 다음 문자인 B 출력)
            ch = fis.read();
            System.out.println((char)ch);
            // C
            ch = fis.read();
            System.out.println((char)ch);
            // D

            // 다 읽은 상태에서 또 read 하면?
            ch = fis.read();
            System.out.println(ch);
            // -1
            System.out.println((char)ch);
            // ￿

        } catch (IOException e) { // FileNotFoundException
            e.printStackTrace();
        }
    }
}