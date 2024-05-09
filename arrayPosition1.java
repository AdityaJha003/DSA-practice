// Given an array of length N, find the count of elements, such that 
/*
 * arr[i] > arr[i-1] && arr[i] > arr[i+1]
 * arr[0] > arr[1]
 * arr[N-1] > arr[N-2]
 * 
 * eg: 5,6,2,1 then answer would be 1. Only 6 is greater than its left and right element.
 */

public class arrayPosition1 {
    public static void main(String[] args) {
        int [] arr = {5,6,2,1};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i==0) {
                if (arr[i]>arr[i+1]) {
                    count++;
                    
                }
            }
            else if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                count++;
                
            }
            if (i==arr.length-1) {
                if (arr[i]>arr[i-1]) {
                    count++;
                    
                }
                
            }
        }
        System.out.println(count);
    }
}
