import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            Arrays.sort(a);
            int min = a[0];
            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();

            for (int x : a) {
                if (x == min) {
                    b.add(x);
                } else {
                    c.add(x);
                }
            }

            if (c.size() == 0) {
                System.out.println("-1");
            } else {
                System.out.println(b.size() + " " + c.size());
                for (int x : b) System.out.print(x + " ");
                System.out.println();
                for (int x : c) System.out.print(x + " ");
                System.out.println();
            }
        }

        sc.close();
    }
}
