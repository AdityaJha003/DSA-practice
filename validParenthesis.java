// https://leetcode.com/problems/valid-parentheses/description/
// Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Example 3:

// Input: s = "(]"
// Output: false


import java.util.ArrayDeque;
import java.util.Deque;

public class validParenthesis {
    public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();

    for (final char c : s.toCharArray())
      if (c == '(')
        stack.push(')');
      else if (c == '{')
        stack.push('}');
      else if (c == '[')
        stack.push(']');
      else if (stack.isEmpty() || stack.pop() != c)
        return false;

    return stack.isEmpty();
  }
  public static void main(String[] args) {
    String s = "()";
    validParenthesis v = new validParenthesis();
    System.out.println(v.isValid(s));
  }
}
