package linearsearch;

import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 5;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target) {
        if (arr.length == 0) {
            return null;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col}; // Return indices of the target element
                }
            }
        }
        return null; // Return null if target is not found in the 2D array
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        if (arr.length == 0) {
            return max; // Return the minimum value if the array is empty
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max; // Return the maximum value found in the 2D array
    }
}
