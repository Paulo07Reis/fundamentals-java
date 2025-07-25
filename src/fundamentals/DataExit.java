package fundamentals;

public class DataExit {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'M';

        Double price1 = 2100.0;
        Double price2 = 650.5;
        Double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f\n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender %s\n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %f\n", measure);
        System.out.printf("Rounded (three decimal places): %.3f\n", measure);
    }
}