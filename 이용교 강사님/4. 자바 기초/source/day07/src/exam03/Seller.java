// ISP(Interface Segregation Principle) - 분리 원칙

package exam03;

public interface Seller {

    void sell();

    // Buyer의 메서드인 order와 메서드명이 같아 호출시 구분 불가능
    default void order() {

        System.out.println("Seller - 주문");

    }

}