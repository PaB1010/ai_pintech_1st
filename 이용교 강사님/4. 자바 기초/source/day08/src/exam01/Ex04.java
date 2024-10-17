// AutoClseable

package exam01;

import java.awt.dnd.Autoscroll;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {

        // Closeable, AutoCloseable
        try (FileInputStream fis = new FileInputStream("a.txt")) {

            System.out.println(fis instanceof AutoCloseable);
            System.out.println(fis instanceof Closeable);
            // true면 autoclose 가능

            // AutoCloseable closeable =  fis;
            // closeable.close();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}