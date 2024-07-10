// https://leetcode.com/problems/add-binary/description/
// Input: a = "11", b = "1"
// Output: "100"

public class addBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
    
        while (i >= 0 || j >= 0 || carry == 1) {
          if (i >= 0)
            carry += a.charAt(i--) - '0';
          if (j >= 0)
            carry += b.charAt(j--) - '0';
          sb.append(carry % 2);
          carry /= 2;
        }
    
        return sb.reverse().toString();
      }
      public static void main(String[] args) {
        addBinary ab = new addBinary();
        String a = "11";
        String b = "1";
        String result = ab.addBinary(a, b);
        System.out.println(result);
      }
}
