package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Q2. Mod Array
 * Unsolved
 * Hint bulb icon
 * Stuck somewhere?
 * Using hints is now penalty free
 * Check Now
 * Problem Description
 * You are given a large number in the form of a array A of size N where each element denotes a digit of the number.
 * You are also given a number B. You have to find out the value of A % B and return it.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 * 0 <= Ai <= 9
 * 1 <= B <= 109
 *
 *
 * Input Format
 * The first argument is an integer array A.
 * The second argument is an integer B.
 *
 *
 * Output Format
 * Return a single integer denoting the value of A % B.
 *
 *
 * Example Input
 * Input 1:
 * A = [1, 4, 3]
 * B = 2
 * Input 2:
 *
 * A = [4, 3, 5, 3, 5, 3, 2, 1]
 * B = 47
 *
 *
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 *
 * 20
 *
 *
 * Example Explanation
 * Explanation 1:
 * 143 is an odd number so 143 % 2 = 1.
 * Explanation 2:
 *
 * 43535321 % 47 = 20
 */
public class ModuloArray {

    public static void main(String[] args) {
        System.out.println("Ans : "+ solve(Arrays.asList(1,4,3),2) );
        System.out.println("Ans : "+ solve(Arrays.asList(4, 3, 5, 3, 5, 3, 2, 1),47) );
    }

    public static int solve(List<Integer> A, int B) {

        long result = 0;
        long pow = 1;

        for(int i=A.size()-1; i>=0; i--) {
            long placeValue = A.get(i) * pow;
            result = (result + placeValue)%B;
            pow = (pow * 10 )%B;
        }

        return (int) result;
    }

}
