package poo.exercise.exercise06.domain;

public class Account {
    private final int number;
    public String name;
    private double balance;

    public Account(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
    }

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
        this.balance = 0.0;
    }

    public void deposit(double quantity){
        this.balance += quantity;
        System.out.println("Update account data:");
        System.out.println(this);
    }

    public void withdraw(double quantity){
        this.balance -= quantity + 5.0;
        System.out.println("Update account data:");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Account %d, Holder: %s, Balance: $%.2f".formatted(number, name, balance);
    }
}
