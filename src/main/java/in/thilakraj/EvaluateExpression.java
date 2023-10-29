package in.thilakraj;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Problem Description
 * An arithmetic expression is given by a string array A of size N. Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p>
 * Valid operators are +, -, *, /. Each string may be an integer or an operator.
 * <p>
 * Note: Reverse Polish Notation is equivalent to Postfix Expression, where operators are written after their operands.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * The only argument given is string array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the value of arithmetic expression formed using reverse Polish Notation.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A =   ["2", "1", "+", "3", "*"]
 * Input 2:
 * A = ["4", "13", "5", "/", "+"]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 9
 * Output 2:
 * 6
 * <p>
 * <p>
 * Example Explanation
 * Explaination 1:
 * starting from backside:
 * * : () * ()
 * 3 : () * (3)
 * + : (() + ()) * (3)
 * 1 : (() + (1)) * (3)
 * 2 : ((2) + (1)) * (3)
 * ((2) + (1)) * (3) = 9
 * Explaination 2:
 * starting from backside:
 * + : () + ()
 * / : () + (() / ())
 * 5 : () + (() / (5))
 * 13 : () + ((13) / (5))
 * 4 : (4) + ((13) / (5))
 * (4) + ((13) / (5)) = 6
 */
public class EvaluateExpression {

    public static void main(String[] args) {
        System.out.println(evalRPN(Arrays.asList("2", "2", "/")));
    }

    public static int evalRPN(List<String> A) {

        Stack<String> numChars = new Stack<>();

        for (int i = 0; i < A.size(); i++) {
            String item = A.get(i);
            if (item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/")) {
                int num2 = Integer.parseInt(numChars.pop());
                int num1 = Integer.parseInt(numChars.pop());
                numChars.push(String.valueOf(eval(num1, num2, item)));
            } else {
                numChars.push(item);
            }
        }

        return Integer.parseInt(numChars.pop());
    }

    private static int eval(int num1, int num2, String item) {

        switch (item) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
        }
        return num1;
    }
}
