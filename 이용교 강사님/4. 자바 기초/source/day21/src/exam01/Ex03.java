// Buffer를 이용하는 byte[] read(byte[] b)

package exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("a.txt")) {

            // 보통 크게 만드는 것이 성능적으로 좋다 연습이라 5
            byte[] buffer = new byte[5];

            while(fis.available() > 0) {

                int value = fis.read(buffer);

                System.out.println(Arrays.toString(buffer));
                /*
                [65, 66, 67, 68, 69]
                [70, 71, 72, 73, 74]
                [75, 76, 77, 78, 79]
                [80, 76, 77, 78, 79]

                Buffer를 비우고 새로 넣은 것이 아니라 연산 효율을 위해
                비우는 과정을 생략하고 덮어 씌웠기 때문에
                마지막에는 76~79가 그대로 있고 80만 덮어씌워짐
                 */

                System.out.printf("읽어온 Byte : %d%n", value);
                /*
                읽어온 Byte : 5
                읽어온 Byte : 5
                읽어온 Byte : 5
                읽어온 Byte : 1
                 */

                /*
                for (int i = 0; i < buffer.length; i++) {

                    System.out.print((char)buffer[i]);
                     /*
                        ABCDE
                        FGHIJ
                        KLMNO
                        PLMNO

                        왜 끝에 LMNO가 반복되는지?
                        -> Buffer가 비워지지 않고 P가 덮어씌워진채로 끝나서
                }
                */

                for (int i = 0; i < value; i++) {

                    System.out.print((char)buffer[i]);
                }
                System.out.println();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}