package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Q4. Reverse the Array
 * Problem Description
 * You are given a constant array A.
 *
 * You are required to return another array which is the reversed form of the input array.
 *
 * Problem Constraints
 * 1 <= A.size() <= 10000
 * 1 <= A[i] <= 10000
 * Input Format
 * First argument is a constant array A.
 * Output Format
 * Return an integer array.
 *
 */
public class ReverseArray {

    public static void main(String[] args) {
        System.out.println("Reverse Array = " + solve(Arrays.asList(1, 2, 3, 2, 1)));
        System.out.println("Reverse Array = " + solve(Arrays.asList(1, 1, 10)));
    }

    public static ArrayList<Integer> solve(List<Integer> A) {
        List<Integer> reversedArray = new ArrayList<>(A);

        for(int i=0; i<A.size()/2 ; i++) {
            reversedArray.set(i, A.get(A.size() -1 -i));
            reversedArray.set(A.size() -1 -i, A.get(i));
        }

        return (ArrayList<Integer>) reversedArray;
    }
}
