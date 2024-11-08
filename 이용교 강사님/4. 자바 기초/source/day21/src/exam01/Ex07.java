// 문자를 Byte 기반 Stream에 사용하면

package exam01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("hello.txt")) {

            fos.write('안');
            fos.write('녕');
            fos.write('하');
            fos.write('세');
            fos.write('요');
            fos.write('.');
            // HUX8�. -> 현재 상태는 byte라서 아스키 코드

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}