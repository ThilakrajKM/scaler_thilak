package in.thilakraj;

/**
 * Problem Description
 * <p>
 * Given an integer A representing a year, Return 1 if it is a leap year else, return 0.
 * <p>
 * A year is a leap year if the following conditions are satisfied:
 * <p>
 * The year is multiple of 400.
 * or the year is multiple of 4 and not multiple of 100.
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= A <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * <p>
 * First and only argument is an integer A
 * <p>
 * <p>
 * <p>
 * Output Format
 * <p>
 * Return 1 if it is a leap year else return 0
 * <p>
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1
 * <p>
 * A = 2020
 * Input 2:
 * <p>
 * A = 1999
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1
 * <p>
 * 1
 * Output 2:
 * <p>
 * 0
 * <p>
 * <p>
 * Example Explanation
 * <p>
 * Explanation 1
 * <p>
 * 2020 is a leap year.
 * 2020 is not a multiple of 400 but it is divisible by 4 and also at the same time not divisible by 100.
 * Explanation 2:
 * <p>
 * 1999 is not a leap year.
 * 199 is not a multiple of 400. It is not divisible by 4 and also at the same time not divisible by 100.
 * All the conditions fail.
 */
public class LeapYearIII {

    public static void main(String[] args) {

    }

    public int solve(int A) {

        int isMultipleOf4 = A % 4, isMultipleOf400 = A % 400, isMultipleOf100 = A % 100;

        if (isMultipleOf400 == 0) {
            if (isMultipleOf4 == 0) {
                return 1;
            }
        } else if (isMultipleOf4 == 0 && isMultipleOf100 != 0) {
            return 1;
        }

        return 0;

    }
}
