public class StringBeautifier {
    public static void main(String[] args) {
        String inputString = "My name is Aditya";
        beautifyString(inputString);
    }

    public static void beautifyString(String inputString) {
        String[] words = inputString.split(" ");
        int maxLength = maxLength(words);

      
        printingStars(maxLength + 2);

        
        for (String word : words) {
            System.out.print("*" + word);
            int spacesToAdd = maxLength - word.length();
            for (int i = 0; i < spacesToAdd; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

       
        printingStars(maxLength + 2);
    }

    public static int maxLength(String[] words) {
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        return maxLength;
    }

    public static void printingStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
