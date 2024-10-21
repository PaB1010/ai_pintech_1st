// name() ordinal() & import static

package exam01.review;

// Transportation에 정의된 정적(static) 자원 import
import static exam01.review.Transportation.*;

public class Ex01 {
    public static void main(String[] args) {

        // import static을 했기때문에 클래스명 생략 가능
        // System.out.printf("SUBWAY.name(): %s, SUBWAY.ordinal() : %d%n", Transportation.SUBWAY.name(), Transportation.SUBWAY.ordinal());
        System.out.printf("SUBWAY.name(): %s, SUBWAY.ordinal() : %d%n", SUBWAY.name(), SUBWAY.ordinal());
        // SUBWAY.name(): SUBWAY, SUBWAY.ordinal() : 0
        System.out.printf("BUS.name(): %s, BUS.ordinal() : %d%n", BUS.name(), BUS.ordinal());
        // BUS.name(): BUS, BUS.ordinal() : 1
        System.out.printf("TAXI.name(): %s, TAXI.ordinal() : %d%n", TAXI.name(), TAXI.ordinal());
        //TAXI.name(): TAXI, TAXI.ordinal() : 2
    }
}