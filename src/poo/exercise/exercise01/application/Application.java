package poo.exercise.exercise01.application;

import java.util.Locale;
import java.util.Scanner;
import poo.exercise.exercise01.domain.Product;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.setName(sc.nextLine());

        System.out.print("Price: ");
        product.setPrice(sc.nextInt());

        System.out.print("Quantity: ");
        product.setQuantity(sc.nextInt());

        System.out.println(product);

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());
        System.out.println("UPDATE" + product);

        System.out.print("Enter the number of products to be remove in stock: ");
        product.removeProducts(sc.nextInt());
        System.out.println("UPDATE" + product);
    }
}
