package poo.problems.problemWithoutPOO;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of the triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of the triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC)/ 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p * xC));

        p = (yA + yB + yC)/ 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p * yC));

        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);

        if (areaX > areaY) {
            System.out.println("Large area: Triangle X");
        } else {
            System.out.println("Large area: Triangle Y");
        }

        sc.close();
    }
}
