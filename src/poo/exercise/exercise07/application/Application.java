package poo.exercise.exercise07.application;

import poo.exercise.exercise07.domain.Product;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vector = new Product[n];

        for (int i = 0; i < vector.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vector[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i].getPrice();
        }

        double avg = sum / n;

        System.out.printf("Average price: %.2f", avg);

        sc.close();
    }
}
