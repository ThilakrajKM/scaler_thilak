package in.thilakraj;

import java.util.ArrayList;

/**
 * Q1. Single Number III
 * Unsolved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 * Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
 * Find the two integers that appear only once.
 * <p>
 * Note: Return the two numbers in ascending order.
 * <p>
 * <p>
 * Problem Constraints
 * 2 <= |A| <= 100000
 * 1 <= A[i] <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument is an array of integers of size N.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an array of two integers that appear only once.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 1, 2, 4]
 * Input 2:
 * <p>
 * A = [1, 2]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * [3, 4]
 * Output 2:
 * <p>
 * [1, 2]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * 3 and 4 appear only once.
 * Explanation 2:
 * <p>
 * 1 and 2 appear only once.
 */
public class SingleNumberIII {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(102);
        al.add(256);
        System.out.println(solve(al));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {

        int twoUniqueNum = 0;

        for (int i = 0; i < A.size(); i++) {
            twoUniqueNum = twoUniqueNum ^ A.get(i);
        }

        int setBitNum = 0;
        for (int i = 31; i >= 0; i--) {
            int num = (1 << i);
            if ((num & twoUniqueNum) == num) {
                setBitNum = num;
                break;
            }
        }

        int uniqNum1 = 0, uniqNum2 = 0;
        for (int i = 0; i < A.size(); i++) {
            if ((A.get(i) & setBitNum) == setBitNum) {
                uniqNum1 = uniqNum1 ^ A.get(i);
            } else {
                uniqNum2 = uniqNum2 ^ A.get(i);
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        if (uniqNum1 < uniqNum2) {
            resultList.add(uniqNum1);
            resultList.add(uniqNum2);
        } else {
            resultList.add(uniqNum2);
            resultList.add(uniqNum1);
        }

        return resultList;
    }
}
