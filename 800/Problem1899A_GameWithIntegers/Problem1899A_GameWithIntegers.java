import java.util.*;

public class Problem1899A_GameWithIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();

            // If n is divisible by 3, Vova (Second) wins. Otherwise, Vanya (First) wins.
            if (n % 3 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
        sc.close();
    }
}
