package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * A wire connects N light bulbs.
 * <p>
 * Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
 * <p>
 * Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
 * <p>
 * You can press the same switch multiple times.
 * <p>
 * Note: 0 represents the bulb is off and 1 represents the bulb is on.
 * <p>
 * Problem Constraints
 * 0 <= N <= 5×10^5
 * 0 <= A[i] <= 1
 * <p>
 * Input Format
 * The first and the only argument contains an integer array A, of size N.
 * <p>
 * Output Format
 * Return an integer representing the minimum number of switches required.
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [0, 1, 0, 1]
 * Input 2:
 * A = [1, 1, 1, 1]
 * <p>
 * Example Output
 * Output 1: 4
 * Output 2: 0
 */
public class Bulbs {

    public static void main(String[] args) {
        System.out.println("Even Sub Array = " + solve(Arrays.asList(0, 1, 0, 1)));
        System.out.println("Even Sub Array = " + solve(Arrays.asList(1, 1, 1, 1)));
    }

    public static int solve(List<Integer> A) {

        int switchActionCount = 0;

        for (int i = 0; i < A.size(); i++) {

            Integer currentBulbState = switchActionCount % 2 == 0 ? A.get(i) : A.get(i) == 1 ? 0 : 1;

            if (currentBulbState == 0) {
                switchActionCount++;
            }
        }

        return switchActionCount;
    }
}
