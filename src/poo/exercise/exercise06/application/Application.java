package poo.exercise.exercise06.application;

import poo.exercise.exercise06.domain.Account;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holderName = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n)?");
        char hasDeposit = sc.next().charAt(0);

        if (hasDeposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            double balance = sc.nextDouble();
            account = new Account(accountNumber, holderName, balance);
        } else {
            account = new Account(accountNumber, holderName);
        }

        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        sc.close();
    }
}
