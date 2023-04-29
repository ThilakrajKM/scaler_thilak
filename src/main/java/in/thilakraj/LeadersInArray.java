package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * <p>
 * Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
 * An element is a leader if it is strictly greater than all the elements to its right side.
 * <p>
 * NOTE: The rightmost element is always a leader.
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= N <= 10^5
 * 1 <= A[i] <= 10^8
 * Input Format
 * <p>
 * There is a single input argument which a integer array A
 * Output Format
 * <p>
 * Return an integer array denoting all the **leader elements** of the array.
 */
public class LeadersInArray {

    public static void main(String[] args) {
        System.out.println("Leaders in a array = " + solve(Arrays.asList(7, 3, 1, 5, 5, 5, 1, 2, 4, 5)));

    }

    public static ArrayList<Integer> solve(List<Integer> A) {

        int max = A.get(A.size() - 1);
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(max);

        for (int i = A.size() - 2; i >= 0; i--) {
            Integer element = A.get(i);
            if (element > max) {
                leaders.add(element);
                max = element;
            }
        }

        return leaders;
    }
}
