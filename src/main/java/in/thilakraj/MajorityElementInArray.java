package in.thilakraj;

import java.util.List;

/**
 * Problem Description
 * Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
 * You may assume that the array is non-empty and the majority element always exists in the array.
 * Problem Constraints
 * 1 <= N <= 5*10^5
 * 1 <= num[i] <= 10^9
 * Input Format
 * Only argument is an integer array.
 * Output Format
 * Return an integer.
 * Example Input
 * Input 1:
 * [2, 1, 2]
 * Input 2:
 * [1, 1, 1]
 * Example Output
 * Input 1:
 * 2
 * Input 2:
 * 1
 */
public class MajorityElementInArray {

    public static void main(String[] args) {

    }

    public int majorityElement(final List<Integer> A) {
        int maxElement = A.get(0);
        int count = 1;

        for (int i = 1; i < A.size(); i++) {

            if (maxElement == A.get(i)) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    maxElement = A.get(i);
                    count++;
                }
            }
        }

        return maxElement;
    }
}
