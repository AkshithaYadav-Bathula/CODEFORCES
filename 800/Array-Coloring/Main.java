import java.util.Scanner;

public class Main {

    public static String canColor(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        if (arr.length < 2) return "NO"; // Needs at least 2 elements

        if (totalSum % 2 == 0) return "YES";
        else return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(canColor(arr));
        }

        sc.close();
    }
}
