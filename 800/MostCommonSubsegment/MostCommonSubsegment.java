import java.util.*;

public class MostCommonSubsegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // length of the array
            int k = sc.nextInt(); // target integer
            boolean found = false;
            int[] a = new int[n]; // array input
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                if(a[i] == k){
                   found = true;
                    break;
                }
            }
            if(found){
                 System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

        sc.close();
    }
}
