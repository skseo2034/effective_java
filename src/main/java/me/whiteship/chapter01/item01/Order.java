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

        // enum 비교시 equals 보다 == 사용을 권장한다.
        // == 은 jvm 레벨에서 하나의 인스턴스가 있을때 가능한데.. enum 은 그렇다.
        // equals 는 null 이 있는 경우 npe 를 발생 시킨다.
        Order order = new Order();
        Order seo = Order.urgentOrder(new Product());
        // order.orderStatus 는 현재 null 이다 그래도 안전하게 동작한다.
        // if (order.orderStatus.equals(OrderStatus.DELIVERED)) { // npe 발생
        if (order.orderStatus == OrderStatus.DELIVERED) {
            System.out.println("delivered");
        }

        // Enum 만 을 담고있는 Map 나 Set을 사용할때는 EnumSet 이나 EnumMap 을 사용해라.
        // 이게 더 효율적이고 빠르다.
//        1. EnumSet, EnumMap 은 배열을 지정하고 상수 index를 통해 Enum 인스턴스를 직접 매핑합니다.
//        이런 구조 때문에 값을 넣고 빼는 것이 시간 측면에서 매우 효율적입니다.
//        2. 마찬가지로 배열을 지정하여 데이터를 저장하기 때문에 메모리가 절약됩니다.
//        그리고 Enum 상수의 개수는 결정되어있기 때문에 HashMap 과 HashSet과 달리 배열이
//        부족하여 늘려줘야 하는 일이 없습니다.
//       3. null 값을 처리하지 않아도 됩니다.
//       HashSet 과 HashMap의 값, key, value 는 null 이 될 수 있습니다.
//       하지만 Enum 상수는 절대 null 이 될 수 없기 때문에 null 값을 처리하는 작업을 하지 않아도 됩니다.





        Arrays.stream(OrderStatus.values()).forEach(System.out::println);
    }

}
