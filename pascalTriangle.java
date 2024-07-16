// https://leetcode.com/problems/pascals-triangle/description/
// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> f = new ArrayList<>();
        f.add(List.of(1));
        for (int i = 0; i < numRows - 1; ++i) {
            List<Integer> g = new ArrayList<>();
            g.add(1);
            for (int j = 0; j < f.get(i).size() - 1; ++j) {
                g.add(f.get(i).get(j) + f.get(i).get(j + 1));
            }
            g.add(1);
            f.add(g);
        }
        return f;
    }
    
    public static void main(String[] args) {
        System.out.println("Pascal Triangle");
    }
}
