// catch 없는 try - catch -finally문

package exam01;

public class Ex06 {
    public static void main(String[] args) {
        add(10, 20);
    }
    
    static int add(int num1, int num2) {
        try {

            return num1 + num2; // 함수 종료

        } finally {

            System.out.println("무조건 실행");

        }
    }
}