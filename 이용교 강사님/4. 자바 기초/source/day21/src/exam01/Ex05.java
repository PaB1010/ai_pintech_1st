// 1Byte씩 파일 input -> 복사 -> 출력

package exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {

        // 1Byte씩 data.zip을 읽어와서 1Byte씩 coppied_data1.zip로 출력

        // 현재 시간을 1/1000초로 계산 숫자
        long stime = System.currentTimeMillis();

        try (FileInputStream fis = new FileInputStream("data.zip"); // File Input Stream
            FileOutputStream fos = new FileOutputStream("copied_data1.zip")) { // File Output Stream

            while (fis.available() > 0) {

                fos.write(fis.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long etime = System.currentTimeMillis();

        System.out.printf("소요 시간 : %d%n", etime - stime);
        // 61743 - 약 1분
    }
}