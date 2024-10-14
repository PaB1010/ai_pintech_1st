// 예외 클래스 메서드

package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02_trycatch {
    public static void main(String[] args) {

        // throw new FileNotFoundException()...
        try {
            FileInputStream fis = new FileInputStream("D:/b.txt");

            System.out.println("정상 처리");

        } catch (FileNotFoundException e) {

            String message = e.getMessage();
            System.out.println(message);
            // D:\b.txt (지정된 파일을 찾을 수 없습니다)

            e.printStackTrace();
            // java.io.FileNotFoundException: D:\b.txt (지정된 파일을 찾을 수 없습니다)
            //	at java.base/java.io.FileInputStream.open0(Native Method)
            //	at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
            //	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
            //	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
            //	at exam01.Ex02_trycatch.main(Ex02_trycatch.java:11)

            // System.out.println("예외 발생");
        }
        System.out.println("아주 매우 중요한 코드");
    }
}