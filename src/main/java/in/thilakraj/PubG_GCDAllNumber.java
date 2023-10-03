package in.thilakraj;

import java.util.ArrayList;

/**
 * Problem Description
 * There are N players, each with strength A[i]. when player i attack player j, player j strength reduces to max(0, A[j]-A[i]). When a player's strength reaches zero, it loses the game, and the game continues in the same manner among other players until only 1 survivor remains.
 * <p>
 * Can you tell the minimum health last surviving person can have?
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 100000
 * <p>
 * 1 <= A[i] <= 1000000
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument of input contains a single integer array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a single integer denoting minimum health of last person.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [6, 4]
 * Input 2:
 * <p>
 * A = [2, 3, 4]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 2
 * Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Given strength array A = [6, 4]
 * Second player attack first player, A =  [2, 4]
 * First player attack second player twice. [2, 0]
 * Explanation 2:
 * <p>
 * Given strength array A = [2, 3, 4]
 * First player attack third player twice. [2, 3, 0]
 * First player attack second player. [2, 1, 0]
 * Second player attack first player twice. [0, 1, 0]
 */

public class PubG_GCDAllNumber {

    public static void main(String[] args) {

    }

    public int solve(ArrayList<Integer> A) {

        int ans = A.get(0);

        for (int i = 1; i < A.size(); i++) {
            int val = gcd(ans, A.get(i));
            ans = Math.min(ans, val);
        }

        return ans;
    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}


