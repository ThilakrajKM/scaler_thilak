package in.thilakraj;

/**
 * Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.
 * <p>
 * <p>
 * Input Format
 * <p>
 * The only argument given is string A.
 * Output Format
 * <p>
 * Return the length of the longest consecutive 1’s that can be achieved.
 * Constraints
 * <p>
 * 1 <= length of string <= 1000000
 * A contains only characters 0 and 1.
 * For Example
 * <p>
 * Input 1:
 * A = "111000"
 * Output 1:
 * 3
 * <p>
 * Input 2:
 * A = "111011101"
 * Output 2:
 * 7
 */
public class LongestConsecutiveOnes {

    public static void main(String[] args) {
        System.out.println("Ans : " + solve("11010110000000000"));
    }

    public static int solve(String A) {

        int countOnes = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '1') {
                countOnes++;
            }
        }

        if (countOnes == A.length()) {
            return A.length();
        }

        if (countOnes == 0) {
            return 0;
        }

        int result = 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '0') {
                int lhs = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if (A.charAt(j) == '1') {
                        lhs++;
                    } else {
                        break;
                    }
                }

                int rhs = 0;
                for (int j = i + 1; j < A.length(); j++) {
                    if (A.charAt(j) == '1') {
                        rhs++;
                    } else {
                        break;
                    }
                }

                if (lhs + rhs == countOnes && result < lhs + rhs) {
                    result = lhs + rhs;
                } else if (lhs + rhs < countOnes && result < lhs + rhs + 1) {
                    result = lhs + rhs + 1;
                }
            }
        }

        return result;
    }
}
