package me.whiteship.chapter01.item02.illegalargumentexception;

import me.whiteship.chapter01.item02.builder.NutritionFacts;
import org.springframework.beans.factory.SmartInitializingSingleton;

import java.time.LocalDate;

public class Order {

    public void updateDeliveryDate(LocalDate deliveryDate) {
        if (deliveryDate == null) {
            throw new NullPointerException("deliveryDate can't be null");
        }

        if (deliveryDate.isBefore(LocalDate.now())) {
            //TODO 과거로 배송 해달라고??
            throw new IllegalArgumentException("deliveryDate can't be earlier than " + LocalDate.now());
        }

       // 배송 날짜 업데이트
    }

    public static void main(String[] args) {
        Order order = new Order();
       // try {
            order.updateDeliveryDate(null);
       // } catch (Exception ex) {
       //     System.out.println(" seo check >>>>>>>>>>>>" + ex.getMessage());
       // }

    }

}
