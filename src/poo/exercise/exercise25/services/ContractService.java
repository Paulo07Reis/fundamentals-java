package poo.exercise.exercise25.services;

import poo.exercise.exercise25.entities.Contract;
import poo.exercise.exercise25.entities.Installment;
import poo.exercise.exercise25.interfaces.OnlinePaymentService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double instalmentValue = contract.getTotalValue() / months;
        List<Installment> installments = new ArrayList<>();
        for (int i = 1; i <= months; i++) {
            LocalDate instalmentDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(instalmentValue, i);
            double paymentFee = onlinePaymentService.paymentFee(interest);

            Installment instant = new Installment(instalmentDate, paymentFee);
            installments.add(instant);
        }
        contract.setInstallments(installments);
    }
}
