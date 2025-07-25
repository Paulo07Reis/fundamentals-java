package poo.exercise.exercise20;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Shape #" + i + " data: ");

            System.out.print("Rectangle or Circle (r/c): ");
            char ch = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                sc.nextLine();

                System.out.print("Height: ");
                double height = sc.nextDouble();
                sc.nextLine();

                Rectangle rectangle = new Rectangle(color, width, height);
                shapes.add(rectangle);
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                sc.nextLine();

                Circle circle = new Circle(color, radius);
                shapes.add(circle);
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape: shapes) {
            System.out.printf("%.2f\n", shape.area());
        }

        sc.close();
    }
}
