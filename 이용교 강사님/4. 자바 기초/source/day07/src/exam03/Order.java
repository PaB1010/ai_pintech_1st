// ISP(Interface Segregation Principle) - 분리 원칙

package exam03;

public class Order implements Seller, Buyer{

    // 추상 메서드 재정의 (구현)
    // 재정의가 가능하다 -> buy & sell = 객체, 인스턴스 메서드
    @Override
    public void buy() {
        System.out.println("구매");
    }

    @Override
    public void sell() {
        System.out.println("판매");
    }

    // 메서드명이 order로 같아 Buyer의 메서드인지 Seller의 메서드인지 명시해 표시
    /*
    @Override
    public void order() {

        // Seller의 order 메서드로 명시
        Seller.super.order();
    }
    */

    // order 메서드 직접 정의
    // 판단 불가시 해당 메서드 호출
    public void order() {
        System.out.println("주문");
    }
}