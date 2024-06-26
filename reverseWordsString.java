// https://leetcode.com/problems/reverse-words-in-a-string/
// Input: s = "the sky is blue"
// Output: "blue is sky the"

public class reverseWordsString {
    public String reverseWords(String s) {
        int i = s.length()-1;

        String ans = "";

        while(i>=0){
            while(i >= 0 && s.charAt(i)==' ') i--;

            int j = i;

            if(i < 0) break;

            while(i >= 0 && s.charAt(i)!=' ') i--;

            if(ans.isEmpty()){
                ans = ans.concat(s.substring(i+1, j+1));
            }
            else{
                ans = ans.concat(" " + s.substring(i+1, j+1));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        reverseWordsString test = new reverseWordsString();
        String s = "the sky is blue";
        System.out.println(test.reverseWords(s));
    }
}
