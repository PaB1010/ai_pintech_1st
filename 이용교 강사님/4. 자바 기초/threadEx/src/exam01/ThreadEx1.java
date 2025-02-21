package exam01;

public class ThreadEx1 {
    public static void main(String[] args) {
        // 메인쓰레드에서 실행.

        Thread1 th1 = new Thread1();
        th1.start(); // 호출스택을 만들어주고 안에 있는 함수를 실행시켜주는 함수.
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.printf("Main-%c%n", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }


}

class Thread1 extends Thread {
    public void run() { // 작업 함수
        // 실행 될 코드

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Thread1-%d%n", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}