package poo.exercise.exercise30;

public class Main {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "Maria@gmail.com");
        Client c2 = new Client("Jose", "jose@gmail.com");
        Client c3 = new Client("Jose", "jose@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));

        //Para comparar referencias
        System.out.println(c1 == c2);
    }
}
