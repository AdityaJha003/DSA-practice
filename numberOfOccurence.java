// given unordered array of integers, find the number of occurence of all elements in the array
// eg. 3,4,2,7,2,3,3,2
// ans. [3,3],[4,1],[2,3],[7,1]

public class numberOfOccurence {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 7, 2, 3, 3, 2 };
        printoccurenceCount(arr);
    }

    public static void printoccurenceCount(int[] arr) {
        int[] countArr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            countArr[num]++;
        }
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] > 0) {
                System.out.println("Element " + i + " occurs " + countArr[i] + " times.");
            }

        }
    }
}