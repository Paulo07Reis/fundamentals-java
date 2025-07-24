package poo.exercise.exercise18.application;

import poo.exercise.exercise18.Domain.ImportedProduct;
import poo.exercise.exercise18.Domain.Product;
import poo.exercise.exercise18.Domain.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Application {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numberOfProducts ; i++) {
            System.out.println();
            System.out.printf("Product #%d data:\n", i);

            System.out.print("Common, used or imported (c/u/i): ");
            char productType = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if (productType == 'i'){
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();
                sc.nextLine();

                ImportedProduct product = new ImportedProduct(name, price, customFee);
                productList.add(product);
            } else if (productType == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.nextLine());

                UsedProduct product = new UsedProduct(name, price, manufactureDate);
                productList.add(product);
            } else {
                Product product = new Product(name, price);
                productList.add(product);
            }
        }

        System.out.println();
        for (Product product : productList) {
            System.out.println(product.priceTag());
        }
    }
}
