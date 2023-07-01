package in.thilakraj;

/**
 * Problem Description
 * On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
 * <p>
 * Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 20
 * <p>
 * 0 <= B < 2A - 1
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is an integer A.
 * <p>
 * Second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the Bth indexed symbol in row A.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = 3
 * B = 0
 * Input 2:
 * <p>
 * A = 4
 * B = 4
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 0
 * Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Row 1: 0
 * Row 2: 01
 * Row 3: 0110
 * Explanation 2:
 * <p>
 * Row 1: 0
 * Row 2: 01
 * Row 3: 0110
 * Row 4: 01101001
 */
public class KthSymbolEasy {

    public static void main(String[] args) {
        //System.out.println("Ans : " + hardCaseSolve(4, 6));
        //System.out.println("Ans : " + hardCaseSolve(3, 2));
        System.out.println("Ans : " + hardCaseSolve(5, 8));
    }

    public static int hardCaseSolve(int A, long B) {
        if (A == 1)
            return 0;
        int res = hardCaseSolve(A - 1, B / 2);
        if (B % 2 == 0)
            return res;
        else
            return 1 - res;
    }

    public static int solve(int A, int B) {

        String value = generateKthSymbol(A, "0", 1);

        return value.charAt(B) - '0';
    }

    private static String generateKthSymbol(int destinationRow, String number, int currentRow) {
        if (currentRow > destinationRow) {
            return number;
        }

        char[] numberChars = number.toCharArray();
        char[] newNumChars = new char[2 * numberChars.length];

        for (int i = 0; i < numberChars.length; i++) {
            if (numberChars[i] == '0') {
                newNumChars[i * 2] = '0';
                newNumChars[(i * 2) + 1] = '1';
            } else {
                newNumChars[i * 2] = '1';
                newNumChars[(i * 2) + 1] = '0';
            }
        }

        return generateKthSymbol(destinationRow, new String(newNumChars), currentRow + 1);
    }

    /**
     * public class Solution {
     *     public int find(int n, long k){
     *      	if(k==0){
     *     		return 0;
     *                }
     *     	int val = find(n- 1 , k / 2);
     *     	if(k % 2 == 0){
     *     		return val;*     	}
     *     	return 1 - val;
     *     }
     *     public int solve(int A, long B) {
     *         return find(A, B);
     *     }
     * }
     */
}
