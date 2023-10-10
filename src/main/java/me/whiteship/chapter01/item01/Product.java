package me.whiteship.chapter01.item01;

import java.util.EnumSet;
import java.util.Set;

public class Product {

    public static void main(String[] args) {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

       // Order order = new Order();
        Order order = Order.getInstance();
        Order seo = Order.urgentOrder(new Product());

        System.out.println(settings1);
        System.out.println(settings2);

        Boolean.valueOf(false);
        EnumSet.allOf(Difficulty.class);
    }
}
