package poo.exercise.exercise04.application;

import poo.exercise.exercise04.domain.Student;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Set the name of the student: ");
        student.setName(sc.nextLine());

        System.out.print("First note: ");
        student.setFirstNote(sc.nextDouble());

        System.out.print("Second note: ");
        student.setSecondNote(sc.nextDouble());

        System.out.print("Third note: ");
        student.setThirdNote(sc.nextDouble());

        student.hasApproved();
    }
}
