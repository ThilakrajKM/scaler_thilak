package in.thilakraj;

import java.util.ArrayList;

/**
 * Problem Description
 * Given an integer A pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*A.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 10
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument is integer A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a sorted list of all possible parenthesis.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = 3
 * Input 2:
 * <p>
 * A = 1
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [ "((()))", "(()())", "(())()", "()(())", "()()()" ]
 * Output 2:
 * <p>
 * [ "()" ]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * All paranthesis are given in the output list.
 * Explanation 2:
 * <p>
 * All paranthesis are given in the output list.
 */
public class GenerateParanthesis {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }

    public static ArrayList<String> generateParenthesis(int A) {
        ArrayList<String> result = new ArrayList<>();
        generateBrackets(0, 0, "", A, result);
        return result;
    }

    private static void generateBrackets(int openingBracket, int closingBracket, String eq,
                                         int n, ArrayList<String> result) {
        if (eq.length() == 2 * n) {
            result.add(eq);
            return;
        }

        if (openingBracket < n) {
            generateBrackets(openingBracket + 1, closingBracket, eq + "(", n, result);
        }

        if (closingBracket < openingBracket) {
            generateBrackets(openingBracket, closingBracket + 1, eq + ")", n, result);
        }
    }


}
