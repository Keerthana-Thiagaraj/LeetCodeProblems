package Arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateExpression {

    public static int evaluate(String exp) throws Exception {

        char[] tokens = exp.toCharArray();

        Deque<Integer> values = new ArrayDeque();
        Deque<Character> operators = new ArrayDeque();


        for (int i = 0; i < tokens.length; i++) {

//            System.out.println(tokens[i]);

            if (tokens[i] == ' ')
                continue;

            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuffer buffer = new StringBuffer();

                while (i < tokens.length && (tokens[i] >= '0' && tokens[i] <= '9')) {
                    buffer.append(tokens[i++]);
                }
                values.push(Integer.parseInt(buffer.toString()));
                i--;
            } else if (tokens[i] == '(')
                operators.push(tokens[i]);

            else if (tokens[i] == ')') {

                while (operators.peek() != '(') {
                    values.push(calculate(operators.pop(), values.pop(), values.pop()));
                }
                operators.pop();
            } else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {

                while (!operators.isEmpty() &&
                        checkPrecedence(tokens[i], operators.peek()))
                    values.push(calculate(operators.pop(), values.pop(), values.pop()));

                operators.push(tokens[i]);
            }
        }

        while (!operators.isEmpty()) {
            values.push(calculate(operators.pop(), values.pop(), values.pop()));
        }
        return values.pop();
    }

    public static int calculate(char operator, int value1, int value2) throws Exception {

        switch (operator) {
            case '+':
                return value1 + value2;
            case '-':
                return value1 - value2;
            case '*':
                return value1 * value2;
            case '/':
                if (value1 == 0) {
                    throw new Exception("cannot divide by zero");
                }
                return value1 / value2;
        }
        return 0;
    }

    public static boolean checkPrecedence(char op1, char op2) {

        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static void main(String[] args) throws Exception {
//        System.out.println(EvaluateExpression.evaluate("100 * ( 2 + 12 ) / 14"));
        System.out.println(EvaluateExpression.evaluate("10 + 2 * 6"));
    }
}
