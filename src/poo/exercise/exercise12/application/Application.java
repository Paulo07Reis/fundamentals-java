package poo.exercise.exercise12.application;

import poo.exercise.exercise12.Entities.*;
import poo.exercise.exercise12.Entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.println();

        System.out.print("Name: ");
        String clientName = sc.nextLine();

        System.out.print("Email: ");
        String clientEmail = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDate = sdf.parse(sc.nextLine());

        Client client = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println();

        System.out.println("Enter order data:");

        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());

        Order order = new Order(client, new Date(), orderStatus);

        System.out.println();
        System.out.print("How many items to this order: ");
        int itemsQuantity = sc.nextInt();
        sc.nextLine();

        System.out.println();
        for (int i = 1; i <= itemsQuantity ; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.println();

            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, product);
            order.addItem(orderItem);
            System.out.println();
        }

        System.out.println(order);

    }
}
