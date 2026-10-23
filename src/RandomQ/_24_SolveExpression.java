package RandomQ;

import java.util.Stack;

/**
 * WAP TO SOLVE PREFIX EXPRESSIONS
 * EX: input :- -*25/93 and output :- 7
 */
public class _24_SolveExpression {

    public static void main(String[] args) {
        String expression = "-*25/93";
        int expected = 7;

        int  output = solveExpression(expression);

        if (output == expected) {
            System.out.println("PASSED: "+output);
        } else {
            System.out.println("FAILED: "+output+", EXPECTED: "+expected);
        }
    }

    private static int solveExpression(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (int i = expression.length() - 1; i >= 0; i--) {

            char token = expression.charAt(i);

            if (Character.isDigit(token)) {
                stack.push(token - '0');
            } else if (isOperation(token)) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                int result = calculate(token, num1, num2);
                stack.push(result);
            } else {
                throw new IllegalArgumentException("Invalid character: "+token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid prefix expression");
        }

        return stack.pop();
    }

    private static int calculate(char op, int num1, int num2) {
        return switch (op) {
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            default -> throw new IllegalStateException("Unexpected value: " + op);
        };
    }

    private static boolean isOperation(char token) {
        return token == '*' || token == '/'
                || token == '+' || token == '-';
    }
}
