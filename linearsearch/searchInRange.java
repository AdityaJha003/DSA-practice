package linearsearch;

public class searchInRange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 3;
        int ans = search(nums, target, 1, 5);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1; // Return a default value indicating target not found
        }

        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index; // Return the index where the target is found
            }
        }
        return -1; // Return -1 if target is not found in the specified range
    }
}
