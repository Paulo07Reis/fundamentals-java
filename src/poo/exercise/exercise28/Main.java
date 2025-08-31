package poo.exercise.exercise28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String path = "src/poo/exercise/exercise28/in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null){
                String[] filds = line.split(",");
                list.add(new Product(filds[0], Double.parseDouble(filds[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expansive: \n" + x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
