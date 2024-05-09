public class changeOrderArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 3, 1, 8, 0, 5};
        int n = arr.length;
        int newArr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                newArr[0] = arr[i];
            }
        }
    }
}
