// palindrome without converting to string

import java.util.*;

public class palindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;    // always gives last digit like 123 and returns 3
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int testInt = 12344321;
        if (isPalindrome(testInt)) {
            System.out.println("The integer " + testInt + " is a palindrome.");
        } else {
            System.out.println("The integer " + testInt + " is not a palindrome.");
        }
    }
}
