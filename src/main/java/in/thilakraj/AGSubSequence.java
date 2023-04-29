package in.thilakraj;

/**
 * Special Subsequences "AG" - 2
 * Problem Description
 * You have given a string A having Uppercase English letters.
 * <p>
 * You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
 * <p>
 * Problem Constraints
 * 1 <= length(A) <= 10^5
 * <p>
 * Input Format
 * First and only argument is a string A.
 * Output Format
 * Return an long integer denoting the answer.
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = "ABCGAG"
 * Input 2:
 * <p>
 * A = "GAB"
 * <p>
 * Example Output
 * <p>
 * Output 1: 3
 * <p>
 * Output 2: 0
 */
public class AGSubSequence {

    public static void main(String[] args) {
        System.out.println("AG Sequence Count  : " + solve("ABCGAG"));
    }

    public static Long solve(String A) {

        long agCount = 0l, gCount = 0l;

        for (int i = A.length() -1; i >= 0; i--) {

            if (A.charAt(i) == 'G') {
                gCount += 1;
            }

            if (A.charAt(i) == 'A') {
                agCount += gCount;
            }
        }

        return agCount;
    }
}
