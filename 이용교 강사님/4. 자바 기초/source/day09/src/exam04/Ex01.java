// Enum 클래스 객체 사용

package exam04;

public class Ex01 {
    public static void main(String[] args) {

        Transportation trans = Transportation.BUS;

        switch (trans) {

            // case Transportation.BUS 하면 오류
            // 어차피 trans라는 매개변수때문에 정보가 있어서 생략
            case BUS :
                System.out.println("버스");
                break;

            case SUBWAY :
                System.out.println("지하철");
                break;

            case TAXI :
                System.out.println("택시");
                break;

            default :
                System.out.println(" ");
        }
    }
}