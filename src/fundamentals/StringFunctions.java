package fundamentals;

public class StringFunctions {
    public static void main(String[] args) {
        String original = "ABCDE abcd";

        String v1 = original.toLowerCase();
        String v2 = original.toUpperCase();
        String v3 = original.substring(2);
        String v4 = original.substring(2, 7);
        String v5 = original.replace("A", "w");

        System.out.println("Lower case: " + v1);
        System.out.println("Upper case: " + v2);
        System.out.println("Substring" + v3);
        System.out.println("Substring with end: " + v4);
        System.out.println("Replace: " + v5);

        String s = "potato apple lemon";
        String[] vector = s.split(" ");
        String w1 = vector[0];
        String w2 = vector[1];
        String w3 = vector[2];

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
    }
}
