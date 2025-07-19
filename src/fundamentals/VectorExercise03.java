package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class VectorExercise03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int numberQuantity = sc.nextInt();

        double[] numbers = new double[numberQuantity];

        for (int i = 0; i < numbers.length ; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
        }

        int pairsNumber = 0;

        System.out.print("Números pares:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                System.out.printf(" %.0f ", numbers[i]);
                pairsNumber++;
            }
        }

        System.out.printf("\nQuantidade de pares = %d", pairsNumber);

        sc.close();
    }
}
