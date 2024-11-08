// create file

package exam01;

import java.io.File;

public class Ex18 {
    public static void main(String[] args) throws Exception {

        /*
        File file = new File("temp.log");

        // 비어있는 File 생성
        file.createNewFile();
         */

        // 두번째 매개변수 = 확장자
        File dir = new File("D:/");

        File tmpFile = File.createTempFile("temp", ".log", dir);

        // 꺼지면 임시파일 temp 삭제
        tmpFile.deleteOnExit();
        // temp 파일이 5초뒤 삭제됨

        // 5초 지연
        Thread.sleep(5000);
    }
}