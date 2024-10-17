package exam01;


// extends java.lang.Object 자동 추가
// public class MyResource extends java.lang.Object implements AutoCloseable {
// =
public class MyResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("MyResource 자원 해제 Close");
    }
}