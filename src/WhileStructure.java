import java.util.Scanner;

public class WhileStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Set a number at the sum: ");
        int number = sc.nextInt();
        int sum = 0;

        while(number != 0){
            sum += number;
            System.out.print("Set a number at the sum: ");
            number = sc.nextInt();
        }

        System.out.println("The sum is: " + sum);
        sc.close();
    }
}
