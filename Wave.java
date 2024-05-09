import java.util.Arrays;

public class Wave {
    public static void main(String[] args) {
        // 2,3,4,5,9,10,20
        // given an array sort it in wave form
        int[] arr = { 2, 9, 4, 10, 5, 20, 3 };
        System.out.println("Original array: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i += 2) {
            if (i > 0 && arr[i - 1] > arr[i]) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
            if (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}