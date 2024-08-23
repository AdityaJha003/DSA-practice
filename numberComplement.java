// https://leetcode.com/problems/number-complement/description/
// Input: num = 5
// Output: 2
// Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

public class numberComplement {

    public int findComplement(int num) {
      
        for (long i = 1; i <= num; i <<= 1)
          num ^= i;
        return num;
      }
      public static void main(String[] args) {
        numberComplement nc = new numberComplement();
        System.out.println(nc.findComplement(5));
      }
}
