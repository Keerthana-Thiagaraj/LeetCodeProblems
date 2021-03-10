package Arrays;


//Given a string s and an integer array indices of the same length.
//
//The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
//Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//Output: "leetcode"
//Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

public class ShuffleString {


    public static void main(String[] args) {

        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        restoreString(s, indices);
    }

    public static String restoreString(String s, int[] indices) {

        char[] chars = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            chars[indices[i]] = s.charAt(i);
        }
        return String.valueOf(chars);
    }
}
