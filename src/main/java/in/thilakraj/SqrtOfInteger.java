package in.thilakraj;

/**
 * Problem Description
 * Given an integer A. Compute and return the square root of A.
 * If A is not a perfect square, return floor(sqrt(A)).
 * <p>
 * The value of A can cross the range of Integer.
 * <p>
 * NOTE:
 * Do not use the sqrt function from the standard library.
 * Users are expected to solve this in O(log(A)) time.
 * <p>
 * <p>
 * Problem Constraints
 * 0 <= A <= 1010
 * <p>
 * <p>
 * Input Format
 * The first and only argument given is the integer A.
 * <p>
 * <p>
 * Output Format
 * Return floor(sqrt(A))
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * 11
 * Input 2:
 * <p>
 * 9
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 3
 * Output 2:
 * <p>
 * 3
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * When A = 11 , square root of A = 3.316. It is not a perfect square so we return the floor which is 3.
 * Explanatino 2:
 * When A = 9 which is a perfect square of 3, so we return 3.
 */
public class SqrtOfInteger {

    public static void main(String[] args) {
        System.out.println(sqrt(2147483647)); //46340
    }

    public static int sqrt(int A) {

        long low = 1, high = A;
        int result = 0;

        while (low <= high) {
            long mid = (low + high) / 2L;
            if (mid * mid == A) {
                return (int) mid;
            } else if (mid * mid > A) {
                high = (mid - 1);
            } else {
                low = (mid + 1);
                result = (int) mid;
            }
        }

        return result;
    }

}
