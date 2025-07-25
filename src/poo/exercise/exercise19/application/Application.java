package poo.exercise.exercise19.application;

import poo.exercise.exercise19.domain.Account;
import poo.exercise.exercise19.domain.BusinessAccount;
import poo.exercise.exercise19.domain.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();

        accountList.add(new SavingsAccount(2, "Marcia", 1000.0, 0.01));
        accountList.add(new BusinessAccount(3, "Bob", 1000.0, 500.0));
        accountList.add(new SavingsAccount(3, "Paulo", 500.0, 0.5));

        double totalBalance = 0.0;
        for (Account account : accountList){
            totalBalance += account.getBalance();
        }

        System.out.println("Total balance: " + totalBalance);

        for (Account account : accountList){
            account.deposit(10.0);
        }

        System.out.println();
        for (Account account : accountList){
            System.out.printf("Updated balance for account %d: %.2f\n", account.getNumber(), account.getBalance());
        }

    }
}
