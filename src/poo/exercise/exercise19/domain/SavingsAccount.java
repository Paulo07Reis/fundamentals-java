package poo.exercise.exercise19.domain;

//Esse final faz com que a classe SavingsAccount não seja herdada
public final class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public final void withdraw(double amount){
        balance -= amount;
    }
    // O final aqui proíbe que o withdraw seja manipulado em outra classe que extende a SavingsAccount (Se fosse possível)

    public void updateBalance(){
        balance += balance * interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
