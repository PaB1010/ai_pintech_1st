// read()

package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("a.txt")) {

            int ch;

            // 다 읽어서 -1 나오면 반복 중단
            // while((ch = fis.read()) != -1) {

            // avilable = 남아있는 읽을 수 있는 byte 수 연산
            // 0이면 다 읽었다는 뜻
            while (fis.available() > 0) {

                System.out.println((char)fis.read());
                // ABCDEFGHIJKLMNOP
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}