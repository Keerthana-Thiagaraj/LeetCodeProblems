package Arrays;
//Given a string s, find the length of the longest substring without repeating characters.
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.

/******* Solution based on a fast pointer and a slow pointer/******/

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println("" + longestSubstring.lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int i = 0, j = 0, maxLength = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                maxLength = Math.max(maxLength, set.size());
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}
