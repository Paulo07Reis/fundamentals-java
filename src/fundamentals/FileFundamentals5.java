package fundamentals;

import java.io.File;
import java.util.Scanner;

public class FileFundamentals5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strPath = "C:\\Users\\paulo\\Desktop\\fundamentals-java\\src\\";

        System.out.print("Enter a folder path: ");
        strPath += sc.nextLine();

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("\nFolder: ");
        for (File folder: folders){
            System.out.println(folder);
        }

        System.out.println("\nFiles: ");
        File[] files = path.listFiles(File::isFile);
        for (File file: files){
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("\nDirectory created successfuly: " + success);

        sc.close();
    }
}
