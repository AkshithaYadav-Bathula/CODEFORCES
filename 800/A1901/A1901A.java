// package CODEFORCES.800;

import java.util.*;

public class A1901A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // number of gas stations
            int x = sc.nextInt(); // destination

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt(); // station positions
            }

            // TODO: Implement logic to compute minimum required tank capacity (d)
             int max_Distance = a[0];
            for(int i = 1; i < n; i++){
                
               
                    max_Distance = Math.max(max_Distance, a[i] - a[i - 1]);
                
            }

             max_Distance = Math.max(max_Distance, 2 * (x - a[n - 1]));
            System.out.println(max_Distance); // print your result here
        }

        sc.close();
    }
}
