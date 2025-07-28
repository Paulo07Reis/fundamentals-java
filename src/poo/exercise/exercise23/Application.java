package poo.exercise.exercise23;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        System.out.print("Enter with the file path: ");
        String path = sc.nextLine();

        File strFile = new File(path);
        String newFilePath = strFile.getParent() + "\\summary.csv";

        try (
                BufferedReader br = new BufferedReader(new FileReader(path));
                BufferedWriter bw = new BufferedWriter(new FileWriter(newFilePath))
        ) {
            String line = br.readLine();

            while (line != null){
                String[] productItems = line.split(",");

                String name = productItems[0];
                double price = Double.parseDouble(productItems[1]);
                int quantity = Integer.parseInt(productItems[2]);

                Product product = new Product(name, price, quantity);
                productList.add(product);

                line = br.readLine();
            }

            System.out.println("\nList of products: ");
            for (Product product : productList){
                System.out.println(product);
                bw.write(product.toString());
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
