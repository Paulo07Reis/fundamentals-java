package poo.exercise.exercise05.application;

import java.util.Locale;
import java.util.Scanner;
import poo.exercise.exercise05.util.CurrencyConverter;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Dollar price: ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought: ");
        double dollarQuantity = sc.nextDouble();

        CurrencyConverter.dollarCalculator(dollarPrice, dollarQuantity);
    }
}
