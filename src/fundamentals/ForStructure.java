package fundamentals;

import java.util.Scanner;

public class ForStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert a number: ");
        int num = sc.nextInt();
        sc.close();

        for(int i = 1; i <= num; i++){
            int square = i * i;
            int cube = square * i;

            System.out.printf("Number: %d, Square of the number: %d, Cube of the number: %d\n", i, square, cube);
        }
    }
}
