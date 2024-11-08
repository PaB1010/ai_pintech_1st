// mkdir

package exam01;

import java.io.File;

public class Ex19 {
    public static void main(String[] args) throws Exception {

        // File file = new File("D:/tmp/test.txt");
        /*
        Exception in thread "main" java.io.IOException: 지정된 경로를 찾을 수 없습니다
	    at java.base/java.io.WinNTFileSystem.createFileExclusively(Native Method)
	    at java.base/java.io.File.createNewFile(File.java:1043)
	    at exam01.Ex19.main(Ex19.java:12)
         */

        // 경로가 실제로 있는지 체크 후 없으면 생성하려고 dir과 file으로 분리
        // File dir = new File("D:/tmp");

        File dir = new File("D:/tmp/sub/sub2");

        if (!dir.exists()) { // 디렉토리가 없다면

            // 디렉토리 1개만 생성, 생성할 디렉토리가 여러개일 경우 오류
            // dir.mkdir();
            
            // 하위 디렉토리까지 모두 생성
            dir.mkdirs();

        }
        File file = new File(dir, "test.txt");

        file.createNewFile();

    }
}