package poo.exercise.exercise08.application;

import poo.exercise.exercise08.domain.Person;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de pessoas que serão cadastradas: ");
        int personNumber = sc.nextInt();
        sc.nextLine();
        Person[] persons = new Person[personNumber];

        for (int i = 0; i < personNumber; i++) {
            System.out.printf("Dados da %d° pessoa:\n", i + 1);

            Person person = new Person();

            System.out.print("Nome: ");
            person.setName(sc.nextLine());

            System.out.print("Idade: ");
            person.setAge(sc.nextInt());

            System.out.print("Altura: ");
            person.setHeight(sc.nextDouble());

            persons[i] = person;
            sc.nextLine();
        }

        double totalHeight = 0.0;
        double minors = 0;

        for (int i = 0; i < persons.length; i++) {
            totalHeight += persons[i].getHeight();
            if (persons[i].getAge() < 16){
                minors++;
            }
        }

        double percent = minors * 100 / personNumber;
        double heightAvg = totalHeight / personNumber;

        System.out.printf("Altura média: %.2f\n", heightAvg);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percent);

        if (minors > 0){
            for (int i = 0; i < persons.length; i++) {
                if (persons[i].getAge() < 16){
                    System.out.println(persons[i].getName());
                }
            }
        }

        sc.close();
    }
}
