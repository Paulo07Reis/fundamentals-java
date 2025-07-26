package fundamentals;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {
    public static void main(String[] args) {

        execution1();
        System.out.println("End of program");
    }

    public static void execution1(){
        System.out.println("***Execution #1 start***");
        execution2();
        System.out.println("***Execution #1 end***");
    }

    public static void execution2(){
        System.out.println("***Execution #2 start***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vector = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vector[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e){
            System.out.println("Input error!");
        }

        sc.close();
        System.out.println("***Execution #2 end***");
    }
}
