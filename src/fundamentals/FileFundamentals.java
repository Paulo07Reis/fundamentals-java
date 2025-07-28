package fundamentals;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileFundamentals {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\paulo\\Desktop\\fundamentals-java\\src\\files\\in.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if(sc != null){
                sc.close();
            }
        }
    }
}
