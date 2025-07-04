package fundamentals;

import java.util.Scanner;

public class CumulativeAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;

        System.out.print("Choice a number (1 - 2 - 3): ");
        int res = sc.nextInt();
        sc.close();

        switch (res) {
            case 1:
                num1 += 1;
                break;
            case 2:
                num2 -= 1;
                break;
            case 3:
                num3 *= 10;
                break;
        }

        System.out.printf("N1: %d, N2 %d, N3: %d", num1, num2, num3);
    }
}
