package poo.exercise.exercise17.application;

import poo.exercise.exercise17.domain.Employee;
import poo.exercise.exercise17.domain.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int employeesNumber = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= employeesNumber; i++) {
            System.out.println("\nEmploy #" + i + " data: ");

            System.out.print("OutSourced (y/n): ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();

            if (ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employeeList.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                employeeList.add(emp);
            }

        }

        System.out.println();
        System.out.println("Payments: ");
        for (Employee employee: employeeList){
            System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
        }
    }
}
