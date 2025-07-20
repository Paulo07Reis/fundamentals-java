package fundamentals;

public class BoxingAndUnboxing {
    public static void main(String[] args) {

        //Boxing
        int x = 20;
        Object obj = x;
        System.out.println(x);

        //Unboxing
        // int y = obj; --> Error pq não tem o cast
        int y = (int) obj;
    }
}
