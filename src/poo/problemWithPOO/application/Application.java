package poo.problemWithPOO.application;

import poo.problemWithPOO.domain.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of the triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of the triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        System.out.printf("Triangle X area: %.4f\n", x.area());
        System.out.printf("Triangle Y area: %.4f\n", y.area());

        if (x.area() > y.area() ) {
            System.out.println("Large area: Triangle X");
        } else {
            System.out.println("Large area: Triangle Y");
        }

        sc.close();
    }
}
