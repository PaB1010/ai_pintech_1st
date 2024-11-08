// 기타 Stream으로 변환해 출력 작업

package exam01;

import java.io.*;

public class Ex09 {
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("hello3.txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bw = new BufferedWriter(osw)) {

            bw.write("안녕하시오.");
            // 안녕하시오.

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}