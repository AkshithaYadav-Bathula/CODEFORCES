// File name: K-Good Segment.java
import java.io.*;
import java.util.*;

public class KGoodSegment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        HashMap<Integer, Integer> mp = new HashMap<>();
        int l = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        int maxi = Integer.MIN_VALUE;

        for (int r = 0; r < a.length; r++) {
            int num = a[r];
            mp.put(num, mp.getOrDefault(num, 0) + 1);

            while (mp.size() > k) {
                int left = a[l];
                mp.put(left, mp.get(left) - 1);
                if (mp.get(left) == 0) {
                    mp.remove(left);
                }
                l++;
            }

            int len = r - l + 1;
            if (len > maxi) {
                maxi = len;
                leftIndex = l;
                rightIndex = r;
            }
        }

        // Convert to 1-based indexing
        System.out.print((leftIndex + 1) + " ");
        System.out.println(rightIndex + 1);
    }
}
