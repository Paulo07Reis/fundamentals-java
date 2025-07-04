package fundamentals;

import java.util.Scanner;

public class ConditionalStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert a number: ");
        int number = sc.nextInt();
        sc.close();

        if(number < 0){
            System.out.println("The number is less than 0");
        } else if (number <= 10) {
            System.out.println("The number is less than 10 or is 10");
        } else {
            System.out.println("The number is greater than 10!");
        }
    }
}
