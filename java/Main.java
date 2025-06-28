class Solution {
    public static int findPages(int[] arr, int k) {
        int n = arr.length;
        if(k > n){
            return -1;
        }
        int ans = 0;
        int maxi = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            maxi = Math.max(maxi, arr[i]);
            sum += arr[i];
        }
        for(int i = maxi; i <= sum; i++){
            int noOfStudents = fun(i, arr, k);
            if(noOfStudents <= k){
               return i;
            }
        }
        return sum;
    }

    public static int fun(int maxi, int[] arr, int k){
        int pages = 0;
        int stu = 1;
        for(int i = 0; i < arr.length; i++){
            if(pages + arr[i] <= maxi){
                pages += arr[i];
            } else {
                stu++;
                pages = arr[i];
            }
        }
        return stu;
    }
}

public class Main {
    public static void main(String[] args) {
        // Test case input
        int[] books = {15, 10, 19, 10, 5, 18, 7};
        int students = 5;

        // Call the method
        int result = Solution.findPages(books, students);

        // Print the result
        System.out.println("Minimum number of pages: " + result);
    }
}
