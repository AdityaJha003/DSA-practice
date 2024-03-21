// https://leetcode.com/problems/richest-customer-wealth/description/

package linearsearch;

public class maxWealth {
    public static void main(String[] args) {
        // Example usage
        int[][] accounts = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        maxWealth maxWealth = new maxWealth();
        System.out.println(maxWealth.maximumWealth(accounts));
    }

    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE; // Initialize ans variable
        // Iterate over each person's accounts
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            // Iterate over each account of the person
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // Check if the sum is greater than the current ans, update ans if so
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans; // Return the maximum wealth
    }
}

