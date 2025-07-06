package poo.exercise.exercise03.application;

import poo.exercise.exercise03.domain.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.setName(sc.nextLine());

        System.out.print("Gross salary: ");
        employee.setGrossSalary(sc.nextDouble());

        System.out.print("Tax: ");
        employee.setTax(sc.nextDouble());

        System.out.printf("Employee: %s, $%.2f\n", employee.getName(), employee.netSalary());

        System.out.print("Which percentage to increase salary?\nR: ");
        employee.increaseSalary(sc.nextDouble());

        System.out.printf("Update data: %s, $%.2f\n", employee.getName(), employee.netSalary());
    }
}
