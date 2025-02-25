// 기타 Stream으로 변환해 읽어오기 작업 & readLine 메서드

package exam01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("hello3.txt");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {

            // 문자열을 한줄씩 읽기
            String line;

            while((line = br.readLine()) != null) {

                System.out.println(line);
            }
            /*
            안녕하시오.
            안녕하시오.
            안녕하시오.
            안녕하시오.
            안녕하시오.
            안녕하시오.
            안녕하시오.
            안녕하시오.
             */

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}