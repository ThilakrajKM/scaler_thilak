package in.thilakraj;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Problem Description
 * Given a binary string A of size N. There are Q queries given by the 2-D array B of size Q x 2.
 * <p>
 * Each query has 2 integers :-
 * <p>
 * First integer denotes the type of query. Type of query can be either 1 or 2.
 * Second integer denotes index x.
 * If type = 1, Flip the value at index x.
 * <p>
 * If type = 2, Find the index of the nearest 1 to the left or right of index x in the array. If there are multiple indices has the same distance from x, return the index with the lower value. If there is no occurrence of 1 in the array, return -1.
 * <p>
 * Note :
 * We use 1-based indexing
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * <p>
 * 1 <= Q <= 105
 * <p>
 * 1 <= B[i][0] <= 2
 * <p>
 * 1 <= B[i][1] <= N
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument A is a string.
 * <p>
 * Second argument B is a 2D array of integers describing the queries.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an array of integers denoting the answers to each query of type 2.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = "10010"
 * B = [[1, 2]
 * [2, 3]]
 * Input 2:
 * A = "010000100"
 * B = [[2, 5]
 * [1, 7]
 * [2, 9]]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * [2]
 * Output 2:
 * [7, 2]
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * After first query, A = "11010".
 * For second query, X = 3. Both index 2 and index 4 are at the same
 * distance but we choose the lower index.
 * For Input 2:
 * For first query, the index 2 is at a distance 3 and index 7 is at a distance 2. So we choose
 * index 7.
 * After second query, A = "010000000"
 * For third query, the only index with '1' is 2.
 */
public class FlipAndNearest {

    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2}, {1, 2}, {1, 5}, {2, 1}};
        ArrayList<ArrayList<Integer>> q = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                list.add(a[i][j]);
            }
            q.add(list);
        }

        System.out.println(solve("00110", q));
    }

    public static ArrayList<Integer> solve(String A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Character> Aarrays = new ArrayList<>();
        TreeSet<Integer> oneSets = new TreeSet<>();

        for (int i = 0; i < A.length(); i++) {
            Aarrays.add(A.charAt(i));
            if (A.charAt(i) == '1') {
                oneSets.add(i + 1);
            }
        }

        for (int i = 0; i < B.size(); i++) {
            int qType = B.get(i).get(0);
            int index = B.get(i).get(1) - 1;

            if (qType == 1) {
                char val = Aarrays.get(index) == '1' ? '0' : '1';
                if (val == '1') {
                    oneSets.add(index + 1);
                } else {
                    oneSets.remove(index + 1);
                }
                Aarrays.set(index, val);
            } else {
                int nearestLeftIndex = Integer.MIN_VALUE, nearestRightIndex = Integer.MAX_VALUE;
                // Returns the least element in this set greater than or equal to the given element,
                // or null if there is no such element.
                if (oneSets.ceiling(index + 1) != null) {
                    // finds the nearest ‘1’ on the right
                    nearestRightIndex = oneSets.ceiling(index + 1);
                }
                // Returns the greatest element in this set less than or equal to the given element,
                // or null if there is no such element.
                if (oneSets.floor(index + 1) != null) {
                    // finds the nearest ‘1’ on the left
                    nearestLeftIndex = oneSets.floor(index + 1);
                }
                // if not found any left or right then return -1
                if (nearestLeftIndex == Integer.MIN_VALUE && nearestRightIndex == Integer.MAX_VALUE) {
                    result.add(-1);
                }
                // if found any left or right then add the minimum index value in the array list
                else if (nearestLeftIndex != Integer.MIN_VALUE && ((index + 1 - nearestLeftIndex) <= (nearestRightIndex - index + 1))) {
                    result.add(nearestLeftIndex);
                } else {
                    result.add(nearestRightIndex);
                }
            }
        }

        return result;
    }


    public int[] solve(String A, int[][] B) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        int n = A.length();

        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '1') {
                treeSet.add(i + 1);
            }
        }

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < B.length; i++) {
            int queryType = B[i][0];

            int indexValue = B[i][1];

            if (queryType == 1) {
                if (treeSet.contains(indexValue)) {
                    treeSet.remove(indexValue);
                } else {
                    treeSet.add(indexValue);
                }
            } else {
                int nearestLeftIndex = Integer.MIN_VALUE, nearestRightIndex = Integer.MAX_VALUE;
                if (treeSet.ceiling(indexValue) != null) {
                    nearestRightIndex = treeSet.ceiling(indexValue);
                }
                if (treeSet.floor(indexValue) != null) {
                    nearestLeftIndex = treeSet.floor(indexValue);
                }
                if (nearestLeftIndex == Integer.MIN_VALUE && nearestRightIndex == Integer.MAX_VALUE) {
                    answer.add(-1);
                } else if (nearestLeftIndex != Integer.MIN_VALUE && ((indexValue - nearestLeftIndex) <= (nearestRightIndex - indexValue))) {
                    answer.add(nearestLeftIndex);
                } else {
                    answer.add(nearestRightIndex);
                }
            }
        }

        int[] result = new int[answer.size()];
        int j = 0;
        for (int i = 0; i < answer.size(); i++) {
            result[j++] = answer.get(i);
        }
        return result;
    }
}
