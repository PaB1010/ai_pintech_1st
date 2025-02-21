package exam01;


public class ThreadEx2 {
    public static void main(String[] args) {
        ThreadEx2_1 th = new ThreadEx2_1();
        //th.run(); // main 쓰레드에서 run 함수가 실행
        th.start(); // 새로운 호출 스택이 생성되고 run() 함수가 실행
    }
}


class ThreadEx2_1 extends Thread {
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}