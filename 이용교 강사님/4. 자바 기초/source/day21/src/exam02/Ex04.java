// 올바른 직렬화 Framwork 활용

package exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Ex04 {
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("obj2.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // Map 형태로 저장하는 것이 가장 효율적
            Map<String, Object> data = new HashMap<>();

            Person p1 = new Person("김이름", 40);
            data.put("p1", p1);

            Person p2 = new Person("박이름", 30);
            data.put("p2", p2);

            data.put("message", "안녕안녕!");

            oos.writeObject(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
