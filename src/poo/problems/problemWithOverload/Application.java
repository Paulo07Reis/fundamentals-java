package poo.problems.problemWithOverload;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, quantity);

        System.out.println(product);

        System.out.print("Price: ");
        product.setPrice(sc.nextInt());

        System.out.println(product);

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());
        System.out.println("UPDATE" + product);

        System.out.print("Enter the number of products to be remove in stock: ");
        product.removeProducts(sc.nextInt());
        System.out.println("UPDATE" + product);
    }
}
