public class arrToInt {
    public static void main(String[] args) {
        String sample = "1234";
        char[] arr = sample.toCharArray();
        for(int i = arr.length - 1; i >= 0; i--) {
            int temp = (int) arr[i] - 48;
            System.out.println(temp);
        }
    }
}
    