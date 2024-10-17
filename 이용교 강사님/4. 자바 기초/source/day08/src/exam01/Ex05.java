//// AutoCloseable 불가능한 클래스 예제
//
//package exam01;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Ex05 {
//    public static void main(String[] args) {
//
//        try (List<String> items = new ArrayList<>()) {
//
//            AutoCloseable closeable = items;
//
//        }
//    }
//}