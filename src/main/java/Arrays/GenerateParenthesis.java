package Arrays;

import java.util.ArrayList;

//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]
public class GenerateParenthesis {

    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> result = new ArrayList<>();
        System.out.println("" + findParenthesisSequence(result, "", 0, 0, n));
    }

    private static ArrayList<String> findParenthesisSequence(ArrayList<String> result, String s, int left, int right, int max) {

        if (s.length() == 2 * max) { //base condition for bactracking
            result.add(s);
            return result;
        }
        if (left < max) {  // open brackets needs to be within max value
            findParenthesisSequence(result, s + "(", left + 1, right, max); // recursive call
        }
        if (right < left) { // corresponding close bracket should be there for open bracket
            findParenthesisSequence(result, s + ")", left, right + 1, max); // recursive call
        }
        return result;
    }
}
