package Arrays;

//Given a non-empty string check if it can be constructed by taking a substring of it and appending
// multiple copies of the substring together.
// You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
//Input: "abab"
//Output: True
//Explanation: It's the substring "ab" twice.
public class RepeatedSubstring {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abcdabcdabc"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        String s1 = s + s;
        return s1.indexOf(s, 1) != s.length();
//        return s1.substring(1, s1.length() - 1).contains(s);
    }
}