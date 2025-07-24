package poo.exercise.exercise14.application;

import poo.exercise.exercise14.domain.Account;
import poo.exercise.exercise14.domain.BusinessAccount;
import poo.exercise.exercise14.domain.SavingsAccount;

public class Application {
    public static void main(String[] args) {
        Account acc = new Account(1, "Paulo", 0.0);
        BusinessAccount bacc = new BusinessAccount(2, "Pedro", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(3, "Marcia", 0.0, 200.0);
        Account acc3 = new SavingsAccount(4, "Luiza", 0.0, 0.01);


        // DOWNCASTING
        // BusinessAccount acc4 = acc2 --> Uma BusinessAccount é uma Account, mas uma account não é uma BusinesAccount
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3; --> acc3 é uma account não umaBusinessAccount

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("LOAN -- ACC5");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("UPDATE BALANCE -- ACC5");
        }
    }
}
