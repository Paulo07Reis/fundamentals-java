package poo.exercise.exercise21;

import poo.exercise.exercise21.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room: ");
        int number = sc.nextInt();

        System.out.print("Check-in date (dd/mm/yyyy): ");
        Date checkIn = sdf.parse(sc.next());

        System.out.print("Check-out date (dd/mm/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");

            System.out.print("Check-in date (dd/mm/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/mm/yyyy): ");
            checkOut = sdf.parse(sc.next());

            String error = reservation.updateDates(checkIn, checkOut);

            if (error != null){
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println("Reservation: " + reservation);
            }
        }

        sc.close();
    }

}
