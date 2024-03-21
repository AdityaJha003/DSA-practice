public class maxItem {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        System.out.println(maxRange(arr, 1, 3));
    }


    static int maxRange(int arr[], int start, int end){

        if (end < start){
            return -1;
        }

        if(arr == null){
            return -1;
        }

        int max = arr[0];
        for (int i = start; i <= end; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
