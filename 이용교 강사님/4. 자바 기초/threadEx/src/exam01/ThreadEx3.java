package exam01;

public class ThreadEx3 {
    public static void main(String[] args) {

        Thread th = new Thread(() -> {
            for (int i = 1; i <= 10 ; i++) {
                System.out.printf("Thread-%d%n", i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        });

        th.start();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.printf("Main-%c%n", ch);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){}
        }
    }
}
