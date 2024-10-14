package exam03.sub01;

import exam03.A;

public class Ex01 {
    public static void main(String[] args) {
        A a= new A();
        
        // num1은 default라서 접근 불가
        // a.num1;
        
        // num2는 public이라 접근 가능
        a.num2 = 20;
    }
}
