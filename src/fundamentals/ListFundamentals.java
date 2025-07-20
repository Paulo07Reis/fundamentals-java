package fundamentals;

import java.util.ArrayList;
import java.util.List;

public class ListFundamentals {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Ana");
        list.add("Bob");
        list.add(2, "Marco");

        System.out.println(list.size());
        for (String name: list){
            System.out.println(name);
        }

        System.out.println("---------------------------");
        list.remove("Ana");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println(list.size());
        for (String name: list){
            System.out.println(name);
        }

        System.out.println("---------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("---------------------------");

        list.add("Ana");
        list.add("Alex");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        for (String name: result){
            System.out.println(name);
        }

        System.out.println("---------------------------");

        String element = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(element);
    }
}
