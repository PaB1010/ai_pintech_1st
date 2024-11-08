// 순서 상관 없는 유연한 역직렬화 - ObjectInputStream

package exam02;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Map;

public class Ex05 {
    public static void main(String[] args) throws Exception {

        try (FileInputStream fis = new FileInputStream("obj2.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Map<String, Object> data = (Map<String, Object>) ois.readObject();

            String message = (String)data.get("message");
            Person p1 = (Person)data.get("p1");

            System.out.println(message);
            // 안녕안녕!
            System.out.println(p1);
            // Person{name='김이름', age=40}
            // 나이 배제 후
            // Person{name='김이름', age=0}
        }
    }
}