import java.util.Stack;

public class validBraces {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String testString = "{[)]}";
        if (isValid(testString)) {
            System.out.println("The string " + testString + " has valid braces.");
        } else {
            System.out.println("The string " + testString + " does not have valid braces.");
        }

        String a = "{}";
        if (isValid(a)) {
            System.out.println("The string " + a + " has valid braces.");
        } else {
            System.out.println("The string " + a + " does not have valid braces.");
        }
    }
}
