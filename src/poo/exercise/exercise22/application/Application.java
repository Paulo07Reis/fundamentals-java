package poo.exercise.exercise22.application;

import poo.exercise.exercise22.entities.Account;
import poo.exercise.exercise22.exeptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Enter account data");

            System.out.print("Number: ");
            int numberAccount = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holderName = sc.nextLine();

            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            sc.nextLine();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(numberAccount, holderName, initialBalance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        } catch (DomainException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
    }
}
