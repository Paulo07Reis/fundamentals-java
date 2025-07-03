import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Set the price of the cart: ");
        double price = sc.nextDouble();
        sc.close();

        double discount = (price < 20.0) ? price * 0.1 : price * 0.5;

        System.out.println("The discount to your cart is: " + discount);
    }
}
