// ISP(Interface Segregation Principle) - 분리 원칙

package exam03;

public class Ex01 {
    public static void main(String[] args) {

        Order order = new Order();

        order.buy();
        // 구매
        order.sell();
        // 판매


        // 다형성
        Buyer buyer = order;
        // Buyer 범위 내의 메서드인 buy만 접근 가능
        buyer.buy();

        // instanceOf 연산
        System.out.println(buyer instanceof Order);
        // true


        // 다형성
        Seller seller = order;
        // Seller 범위 내의 메서드인 seoll만 접근 가능
        seller.sell();

        // instanceOf 연산
        System.out.println(seller instanceof Order);
        // true

        // default 메서드
        order.order();
        // Buyer - 주문
    }
}