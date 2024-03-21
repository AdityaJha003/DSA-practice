package linearsearch;

public class searchInString {
    public static void main(String[] args) {
        String name = "Aditya";
        char target = 'd';
        System.out.println(search(name, target));
    }
    
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {
                return true;
            }
        }
        return false;
    }
}
