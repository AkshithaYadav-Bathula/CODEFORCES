import java.util.*;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // Number of elements
        int[] a = new int[n];          // Array of integers

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Write your logic here
       int minOps = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int ops = Math.abs(a[i]);
            if(ops == 0){
                minOps = 0;
            }
            if (ops < minOps) {
                minOps = ops;
            }
        }
        System.out.println(minOps);
        sc.close();
    }
}
