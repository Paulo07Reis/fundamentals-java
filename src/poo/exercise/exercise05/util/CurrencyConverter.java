package poo.exercise.exercise05.util;

public class CurrencyConverter {

    public static void dollarCalculator(double dollarPrice, double dollarQuantity){
        double totalValue = (dollarPrice * dollarQuantity) * 1.06;
        System.out.printf("Amount to be paid in reais: %.2f", totalValue);
    }
}
