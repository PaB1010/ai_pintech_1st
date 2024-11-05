// Proxy 데코레이터 패턴(공통 기능과 핵심 기능의 분리)

package org.koreait.exam02;

public class ProxyCalculator implements Calculator{

    // private Calculator cal = new ImplCalculator();
    // SOLID에 의해 변경

    private Calculator cal;

    public ProxyCalculator(Calculator cal) {
        this.cal = cal;
    }

    @Override
    public long factorial(long num) {

        long stime = System.nanoTime(); // 공통 기능

        try {
            long result = cal.factorial(num);
            // 핵심 기능(factorial 연산)을 대신해서 수행!

            return result;
        } finally { // return해도 수행되어야해서 finally 사용
            long etime = System.nanoTime();
            System.out.printf("걸린 시간 : %d%n", etime - stime);
        }
    }
}