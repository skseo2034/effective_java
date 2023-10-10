package me.whiteship.chapter01.item01;

import java.util.*;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;


    private Order() {}
    // 정적 팩토리 메소드로 생성.
    // 아래와 같이 동일한 시그니쳐를 사용하는 경우 생성 불가하다.(생성자의 시그니쳐가 중복되는 경우)
    // 그때 정적 팩토리 메소스를 고려 해 볼수 있다.

//    public Order (Product product, boolean prime) {
//        this.product = product;
//        this.prime = prime;
//    }
//
//    public Order (Product product, boolean urgent) {
//        this.product = product;
//        this.prime = prime;
//    }

    // 고려된 정적 팩토리 메소드.
    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;

        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    private static final Order ORDER = new Order();
    public static Order getInstance() {
        return ORDER;
    }
    public static void main(String[] args) {

        Order order = new Order();
        Order seo = Order.urgentOrder(new Product());
        if (order.orderStatus == OrderStatus.DELIVERED) {
            System.out.println("delivered");
        }
    }

}
