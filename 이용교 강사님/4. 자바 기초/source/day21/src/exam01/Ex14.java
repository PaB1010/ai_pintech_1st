// DataInputStream - 하나의 자료형

package exam01;

import java.io.*;

public class Ex14 {
    public static void main(String[] args) {

        int total = 0, count = 0;

        try (FileInputStream fis = new FileInputStream("score.txt");
             DataInputStream dis = new DataInputStream(fis)) { // Data Input Stream

            while (true) {

                int score = dis.readInt();
                total += score;
                count++;
            }
        } catch (EOFException e ) { // 다 읽은 경우 발생 - 총합 & 평균 출력

            double avg = total / (double)count;

            System.out.printf("합계 : %d / 평균 : %.2f", total, avg);
            // .2f = 소수점 둘쨰 자리까지
            // 합계 : 484 / 평균 : 80.67

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}