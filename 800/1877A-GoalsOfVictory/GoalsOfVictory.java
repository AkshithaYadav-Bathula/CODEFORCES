import java.util.*;

public class GoalsOfVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // number of test cases
        
        while (T-- > 0) {
            int n = sc.nextInt(); // number of players
            long sum = 0;

            for (int i = 0; i < n - 1; i++) {
                long temp = sc.nextLong();
                sum += temp;
            }

            System.out.println(-sum); // Output: score of the last player
        }

        sc.close();
    }
}
