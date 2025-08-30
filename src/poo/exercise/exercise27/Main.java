package poo.exercise.exercise27;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ListService<Professor> professorList = new ListService<>();
        ListService<Aluno> alunoList = new ListService<>();
        Character choice;
        String name;
        Date birth;

        try {
            do {
                System.out.print("""
                        Bem vindo(a) ao cadastro estudantil!
                        
                        Você é:
                        A) Professor(a)
                        B) Aluno(a)
                        C) Sair
                        
                        Escolha uma opção:""");

                choice = sc.nextLine().toUpperCase().charAt(0);

                switch (choice) {
                    case 'A':
                        System.out.print("Informe o seu nome: ");
                        name = sc.nextLine();

                        System.out.print("Informe a sua data de nascimento: ");
                        birth = sdf.parse(sc.nextLine());

                        System.out.print("Qual materia você ensina:");
                        String subject = sc.next();

                        professorList.addItem(new Professor(name, birth, subject));

                        System.out.println("Parabéns você foi cadastrado(a)!");

                        professorList.listItems();
                        System.out.println("\n\n\n");
                        break;
                    case 'B':
                        System.out.print("Informe o seu nome: ");
                        name = sc.nextLine();

                        System.out.print("Informe a sua data de nascimento: ");
                        birth = sdf.parse(sc.nextLine());

                        System.out.print("Qual a sua turma:");
                        String room = sc.next();

                        alunoList.addItem(new Aluno(name, birth, room));

                        System.out.println("Parabéns você foi cadastrado(a)!");

                        alunoList.listItems();
                        System.out.println("\n\n\n");
                        break;
                    case 'C':
                        System.out.println("Até mais!");
                        break;
                    default:
                        System.out.println("Escolha um valor válido!");
                }

                sc.nextLine();
            } while (choice != 'C');
        } catch (ParseException ex) {
            System.out.println("Parse error!");;
        }

    }
}
