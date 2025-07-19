package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class VectorExercise01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qunatos números você vai digitar: ");
        int numberQuantity = sc.nextInt();
        double[] vector = new double[numberQuantity];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextDouble();
        }

        System.out.println("Números negativos: ");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0){
                System.out.println(vector[i]);
            }
        }

        sc.close();
    }
}
