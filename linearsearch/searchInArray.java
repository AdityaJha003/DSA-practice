package linearsearch;

public class searchInArray {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int []arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        } 

        return -1;
    }
}
