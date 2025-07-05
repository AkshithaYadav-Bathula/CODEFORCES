import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long annaMoves = a + (c + 1) / 2;
            long katieMoves = b + c / 2;

            if (annaMoves > katieMoves) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
        sc.close();
    }
}
