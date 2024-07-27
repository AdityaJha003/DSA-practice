// https://leetcode.com/problems/generate-parentheses/description/
// Input: n = 3
// Output: ["((()))","(()())","(())()","()(())","()()()"]
// Input: n = 1
// Output: ["()"]


import java.util.ArrayList;
import java.util.List;

public class generateParentheses {
    public List<String> generateParenthesis(int n) {
    List<String> ans = new ArrayList<>();
    dfs(n, n, new StringBuilder(), ans);
    return ans;
  }

  private void dfs(int l, int r, StringBuilder sb, List<String> ans) {
    if (l == 0 && r == 0) {
      ans.add(sb.toString());
      return;
    }

    if (l > 0) {
      sb.append("(");
      dfs(l - 1, r, sb, ans);
      sb.deleteCharAt(sb.length() - 1);
    }
    if (l < r) {
      sb.append(")");
      dfs(l, r - 1, sb, ans);
      sb.deleteCharAt(sb.length() - 1);
    }
  }
  public static void main(String[] args) {
    generateParentheses gp = new generateParentheses();
    System.out.println(gp.generateParenthesis(3));
  }
}