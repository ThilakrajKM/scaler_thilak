package in.thilakraj;

import java.util.*;

/**
 * Problem Description
 * Given an integer array A of size N. You can remove any element from the array in one operation.
 * The cost of this operation is the sum of all elements in the array present before this operation.
 * <p>
 * Find the minimum cost to remove all elements from the array.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 0 <= N <= 1000
 * 1 <= A[i] <= 103
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument is an integer array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the total cost of removing all elements from the array.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [2, 1]
 * Input 2:
 * <p>
 * A = [5]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 4
 * Output 2:
 * <p>
 * 5
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Given array A = [2, 1]
 * Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
 * Remove 1 from the array => []. Cost of this operation is (1) = 1.
 * So, total cost is = 3 + 1 = 4.
 * Explanation 2:
 * <p>
 * There is only one element in the array. So, cost of removing is 5.
 */
public class ElementsRemoval {

    public static void main(String[] args) {
        System.out.println("Ans" + solve(Arrays.asList(10, 8)));
    }

    public static int solve(List<Integer> A) {

        Collections.sort(A, Comparator.comparingInt(value -> (Integer) value).reversed());

        ArrayList<Integer> pSum = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            pSum.add(i == 0 ? A.get(i) : A.get(i) + pSum.get(i - 1));
        }

        int result = pSum.get(A.size() - 1);

        for (int i = 0; i < A.size(); i++) {
            result += pSum.get(A.size() - 1) - pSum.get(i);
        }

        return result;
    }


    /*
    public int solve(ArrayList<Integer> A) {

        Collections.sort(A);
        int sum = 0, ans = 0;

        for(int i=0;i<A.size();i++)
        {
            sum += (A.size()-i)*A.get(i);
        }

        return sum;
    }
     */
}
