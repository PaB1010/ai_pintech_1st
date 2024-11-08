// Buffer 이용해 파일 input -> 복사 -> 출력

package exam01;

import java.io.*;

public class Ex06 {
    public static void main(String[] args) {

        long stime = System.currentTimeMillis();

        try (FileInputStream fis = new FileInputStream("data.zip");
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream("copied_data2.zip");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            while (bis.available() > 0) {

                bos.write(bis.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long etime = System.currentTimeMillis();

        System.out.printf("소요 시간 : %d%n", etime - stime);
        // 소요 시간 : 15880
    }
}