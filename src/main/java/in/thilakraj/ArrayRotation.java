package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Array Rotation
 * Problem Description
 * Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
 *
 * Problem Constraints
 * 1 <= N <= 10^5
 * 1 <= A[i] <=10^9
 * 1 <= B <= 10^9
 *
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is the integer B.
 *
 * Output Format
 * Return the array A after rotating it B times to the right
 */
public class ArrayRotation {

    public static void main(String[] args) {
        //System.out.println("Reverse Array = " + solve(Arrays.asList(1, 2, 3, 4), 2 ));
        //System.out.println("Reverse Array = " + solve(Arrays.asList(2, 5, 6), 1 ));
        System.out.println("Reverse Array = " + solve(Arrays.asList(1, 1, 4, 9, 4, 7, 1), 9 ));
    }

    public static ArrayList<Integer> solve(List<Integer> A, int B) {

        //Reverse an Array
        List<Integer> reversedArray = new ArrayList<>(A);

        for(int i=0; i<A.size()/2 ; i++) {
            reversedArray.set(i, A.get(A.size() -1 -i));
            reversedArray.set(A.size() -1 -i, A.get(i));
        }

        //Rotation
        int rotation = B % A.size();

        for(int i =0; i< rotation/2 ; i++) {
            int temp = reversedArray.get(i);
            reversedArray.set(i, reversedArray.get(rotation -1 -i));
            reversedArray.set(rotation -1 -i, temp);
        }

        for(int i =rotation, endLength = A.size() - 1; i<endLength  ; i++, endLength--) {
            int temp = reversedArray.get(i);
            reversedArray.set(i, reversedArray.get(endLength));
            reversedArray.set(endLength, temp);
        }

        return (ArrayList<Integer>) reversedArray;
    }

}
