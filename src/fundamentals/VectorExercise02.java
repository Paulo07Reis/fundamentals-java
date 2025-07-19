package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class VectorExercise02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int numberQuantity = sc.nextInt();
        double[] vector = new double[numberQuantity];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }

        double avg = sum / numberQuantity;

        System.out.print("Valores: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.printf(" %.1f", vector[i]);
        }
        System.out.printf("\nSoma: %.2f \n", sum);
        System.out.printf("Média: %.2f\n", avg);

        sc.close();
    }
}
