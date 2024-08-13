// https://leetcode.com/problems/combination-sum-ii/description/
// Input: candidates = [10,1,2,7,6,1,5], target = 8
// Output: 
// [
// [1,1,6],
// [1,2,5],
// [1,7],
// [2,6]
// ]


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(candidates);
    dfs(0, candidates, target, new ArrayList<>(), ans);
    return ans;
  }

  private void dfs(int s, int[] candidates, int target, List<Integer> path,
                   List<List<Integer>> ans) {
    if (target < 0)
      return;
    if (target == 0) {
      ans.add(new ArrayList<>(path));
      return;
    }

    for (int i = s; i < candidates.length; ++i) {
      if (i > s && candidates[i] == candidates[i - 1])
        continue;
      path.add(candidates[i]);
      dfs(i + 1, candidates, target - candidates[i], path, ans);
      path.remove(path.size() - 1);
    }
  }
  public static void main(String[] args) {
    combinationSumII obj = new combinationSumII();
    int[] candidates = {10,1,2,7,6,1,5};
    int target = 8;
    System.out.println(obj.combinationSum2(candidates, target));
  }
}
