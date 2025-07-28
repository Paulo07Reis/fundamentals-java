package poo.exercise.exercise24;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.print("Entre com os dados do aluguel: ");
        String carModel = sc.nextLine();
        Vehicle vehicle = new Vehicle(carModel);

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);

        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental carRental = new CarRental(vehicle, start, finish);

        System.out.print("Entre com o preço por hora:");
        double pricePerHour = sc.nextDouble();

        System.out.print("Entre com o preço por dia:");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("\nFATURA: ");
        System.out.println("Pagamento básico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

        sc.close();
    }
}
