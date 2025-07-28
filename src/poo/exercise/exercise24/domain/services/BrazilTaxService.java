package poo.exercise.exercise24.domain.services;

public class BrazilTaxService implements TaxService {

    public Double tax(double amount){
        if (amount <= 100){
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
