// gettitle

package exam01.review;

import static exam01.review.Transportation.*;

public class Ex04 {
    public static void main(String[] args) {

        // BUS가 객체라서 바로 getTitle 메서드 호출 가능
        System.out.println(Transportation.BUS.getTitle());
        // 버스
        System.out.println(Transportation.SUBWAY.getTitle());
        // 지하철
        System.out.println(Transportation.TAXI.getTitle());
        // 택시

        System.out.printf("버스 10명 요금 : %d%n", BUS.getTotal(10));
        // 버스 10명 요금 : 14000
        System.out.printf("지하철 10명 요금 : %d%n", SUBWAY.getTotal(10));
        // 지하철 10명 요금 : 15000
        System.out.printf("택시 10명 요금 : %d%n", TAXI.getTotal(10));
        // 택시 10명 요금 : 40000

    }
}
