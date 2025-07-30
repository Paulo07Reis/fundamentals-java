package poo.exercise.exercise25.application;

import poo.exercise.exercise25.entities.Contract;
import poo.exercise.exercise25.services.ContractService;
import poo.exercise.exercise25.entities.Installment;
import poo.exercise.exercise25.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.println("Entre os dados do contrato:\n");

            System.out.print("Número: ");
            int contractNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Data (dd/MM/yyyy): " );
            LocalDate contractDate = LocalDate.parse(sc.nextLine(), dtf);

            System.out.print("Valor do contrato: ");
            double contractValue = sc.nextDouble();
            sc.nextLine();

            Contract contract = new Contract(contractNumber, contractDate, contractValue);

            System.out.print("Entre com o número de parcelas: ");
            int installmentQuantity = sc.nextInt();
            sc.nextLine();

            ContractService service = new ContractService(new PaypalService());

            service.processContract(contract, installmentQuantity);

            List<Installment> installments = contract.getInstallments();

            System.out.println("Parcelas: ");
            for (Installment installment : installments){
                System.out.println(installment);
            }

        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
