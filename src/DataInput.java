import java.util.Scanner;

public class DataInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Test:");
        System.out.println("What is the X value?");
        System.out.print("R: ");
        int x = sc.nextInt();
        sc.close();
        System.out.printf("X = %d", x);
    }
}
