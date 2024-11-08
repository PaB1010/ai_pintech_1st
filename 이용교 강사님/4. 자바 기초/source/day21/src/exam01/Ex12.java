// DataInputStream - 기본 자료형 사용 가능

package exam01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;

public class Ex12 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("data.txt");
             DataInputStream dis = new DataInputStream(fis)) {

            // 실제 데이터 순서와 일치해야 함
            // 순서가 다를 경우 값이 달라짐..!
            // 고로 자료형을 섞어쓰지 않고 한가지의 자료형만 사용하는 것이 주 용도
            int num = dis.readInt();
            boolean result = dis.readBoolean();
            String str = dis.readUTF();

            System.out.printf("num = %d / result = %s / str = %s%n", num, result, str);
            // num = 100 / result = true / str = 안녕안녕

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}