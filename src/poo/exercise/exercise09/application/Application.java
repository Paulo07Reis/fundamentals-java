package poo.exercise.exercise09.application;

import poo.exercise.exercise09.domain.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered: ");
        int employeeQuantity = sc.nextInt();
        sc.nextLine();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < employeeQuantity; i++) {
            Employee employee = new Employee();

            System.out.printf("\nEmployee #%d:\n", i + 1);

            System.out.print("Id: ");
            employee.setId(sc.nextInt());
            sc.nextLine();

            System.out.print("Name: ");
            employee.setName(sc.nextLine());

            System.out.print("Salary: ");
            employee.setSalary(sc.nextDouble());
            System.out.println();
            employeeList.add(employee);
        }

        System.out.print("Enter the employ id that will have salary increase: ");
        int id = sc.nextInt();
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

        Employee result = employeeList.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);

        if (result != null){
            result.increaseSalary(percentage);
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println("\nList of employees: ");
        for(Employee employee : employeeList){
            System.out.println(employee.toString());
        }
    }
}
