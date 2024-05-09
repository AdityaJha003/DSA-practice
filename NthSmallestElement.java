// find the nth smallest element in an array.
// eg. 7,9,4,3,19,17 where N = 3
// ans = 7

import java.util.Arrays;

public class NthSmallestElement {

    public static int findNthSmallest(int[] arr, int n) {
        Arrays.sort(arr); 
        if (n < 1 || n > arr.length) {
            return -1; 
        }
        return arr[n - 1];
    }
    public static void main(String[] args) {
        int arr []= {7,9,4,3,19,17};
        int n = 3;
        int nthSmallest = findNthSmallest(arr, n);
        System.out.println("The " + n + "th smallest element is: " + nthSmallest);
    }
}
