package poo.exercise.exercise15.application;

import poo.exercise.exercise15.domain.Account;
import poo.exercise.exercise15.domain.BusinessAccount;
import poo.exercise.exercise15.domain.SavingsAccount;

public class Application {
    public static void main(String[] args) {

        Account acc1 = new Account(1, "Paulo", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(2, "Pedro", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(3, "Marcia", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
