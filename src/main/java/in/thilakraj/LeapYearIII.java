package in.thilakraj;

/**
 * Problem Description
 *
 * Given an integer A representing a year, Return 1 if it is a leap year else, return 0.
 *
 * A year is a leap year if the following conditions are satisfied:
 *
 * The year is multiple of 400.
 * or the year is multiple of 4 and not multiple of 100.
 *
 * Problem Constraints
 *
 * 1 <= A <= 109
 *
 *
 *
 * Input Format
 *
 * First and only argument is an integer A
 *
 *
 *
 * Output Format
 *
 * Return 1 if it is a leap year else return 0
 *
 *
 *
 * Example Input
 *
 * Input 1
 *
 *  A = 2020
 * Input 2:
 *
 *  A = 1999
 *
 *
 * Example Output
 *
 * Output 1
 *
 *  1
 * Output 2:
 *
 *  0
 *
 *
 * Example Explanation
 *
 * Explanation 1
 *
 *  2020 is a leap year.
 *  2020 is not a multiple of 400 but it is divisible by 4 and also at the same time not divisible by 100.
 * Explanation 2:
 *
 *  1999 is not a leap year.
 *  199 is not a multiple of 400. It is not divisible by 4 and also at the same time not divisible by 100.
 *  All the conditions fail.
 */
public class LeapYearIII {

    public static void main(String[] args) {

    }

    public int solve(int A) {

        int isMultipleOf4 = A%4, isMultipleOf400= A%400, isMultipleOf100=A%100;

        if(isMultipleOf400==0) {
            if(isMultipleOf4==0) {
                return 1;
            }
        }else if(isMultipleOf4==0 && isMultipleOf100!=0) {
            return 1;
        }

        return  0;

    }
}
