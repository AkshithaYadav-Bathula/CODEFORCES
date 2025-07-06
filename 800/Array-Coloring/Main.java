import java.util.Scanner;

public class Main {

    public static String canColor(int[] arr) {
        int oddCount = 0;
        int evenCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Both groups must be non-empty and have the same parity
        if (oddCount > 0 && evenCount > 0) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Length of array
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(canColor(arr));
        }

        sc.close();
    }
}
