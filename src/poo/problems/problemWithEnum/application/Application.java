package poo.problems.problemWithEnum.application;

import poo.problems.problemWithEnum.domain.models.Order;
import poo.problems.problemWithEnum.domain.enums.OrderStatus;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
