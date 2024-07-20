// https://leetcode.com/problems/integer-to-roman/description/
// Input: num = 3749

// Output: "MMMDCCXLIX"

// Explanation:

// 3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
//  700 = DCC as 500 (D) + 100 (C) + 100 (C)
//   40 = XL as 10 (X) less of 50 (L)
//    9 = IX as 1 (I) less of 10 (X)
// Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places

public class integerToRoman {
    public String intToRoman(int num) {
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M",  "CM", "D",  "CD", "C",  "XC", "L",
                                  "XL", "X",  "IX", "V",  "IV", "I"};
        StringBuilder sb = new StringBuilder();
    
        for (int i = 0; i < values.length; ++i) {
          if (num == 0)
            break;
          while (num >= values[i]) {
            num -= values[i];
            sb.append(symbols[i]);
          }
        }
    
        return sb.toString();
      }
      public static void main(String[] args) {
        integerToRoman obj = new integerToRoman();
        System.out.println(obj.intToRoman(3749));
      }
}
