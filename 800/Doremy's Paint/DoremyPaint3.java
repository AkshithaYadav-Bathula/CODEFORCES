import java.util.*;

public class DoremyPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> freq = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
            
            // More than 2 unique values → impossible
            if (freq.size() > 2) {
                System.out.println("NO");
                continue;
            }
            
            // All elements same → always possible
            if (freq.size() == 1) {
                System.out.println("YES");
                continue;
            }
            
            // Exactly 2 distinct elements
            ArrayList<Integer> freqValues = new ArrayList<>(freq.values());
            int f1 = freqValues.get(0);
            int f2 = freqValues.get(1);
            
            // Check frequency conditions based on array length
            if (n % 2 == 0) {
                // Even length: frequencies must be equal
                if (f1 == f2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                // Odd length: frequencies must differ by exactly 1
                if (Math.abs(f1 - f2) == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        
        sc.close();
    }
}