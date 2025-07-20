package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] vector = new String[] {"Maria", "Bob", "Alex"};

        //For tradicional
        //for (int i = 0; i < ; i++) {}

        for (String name : vector){
            System.out.println(name);
        }

        sc.close();
    }
}
