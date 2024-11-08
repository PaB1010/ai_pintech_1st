// 역직렬화 - ObjectInputStream

package exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex03 {
    public static void main(String[] args) throws Exception {

        try (FileInputStream fis = new FileInputStream("obj1.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            // Person보다 아래에 String이 있는데 String 먼저 부르니
            // 순서가 맞지 않아서 오류!
            /*
            String message = (String)ois.readObject();
            System.out.println(message);
             */

            // 순서 중요
            Person p1 = (Person)ois.readObject();

            System.out.println(p1);
            // Person{name='김이름', age=40}

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}