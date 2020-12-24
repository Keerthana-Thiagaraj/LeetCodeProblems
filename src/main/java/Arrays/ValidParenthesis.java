package Arrays;

import java.util.ArrayDeque;
import java.util.Deque;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
//eg-Input: s = "()"
//Output: true
public class ValidParenthesis {

    public static void main(String[] args) {
        String s = "([)]";
        System.out.println("" + checkValidOrNot(s));
    }

    public static boolean checkValidOrNot(String s) {
        // faster than using stack
        Deque<Character> characterDeque = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);

            if (bracket == '(' || bracket == '{' || bracket == '[') {
                characterDeque.push(bracket);
                continue;
            }

            if (characterDeque.isEmpty()) {
                return false;
            }
            char checkBracket;
            switch (bracket) {
                case ')':
                    checkBracket = characterDeque.pop();
                    if (checkBracket == '{' || checkBracket == '[')
                        return false;
                    break;
                case '}':
                    checkBracket = characterDeque.pop();
                    if (checkBracket == '(' || checkBracket == '[')
                        return false;
                    break;
                case ']':
                    checkBracket = characterDeque.pop();
                    if (checkBracket == '{' || checkBracket == '(')
                        return false;
                    break;
            }
        }
        return characterDeque.isEmpty();
    }
}
