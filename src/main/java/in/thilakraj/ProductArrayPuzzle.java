package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.
 * <p>
 * Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.
 * <p>
 * Input Format
 * <p>
 * The only argument given is the integer array A.
 * Output Format
 * <p>
 * Return the product array.
 * <p>
 * Constraints
 * <p>
 * 2 <= length of the array <= 1000
 * 1 <= A[i] <= 10
 * <p>
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * Output 1:
 * [120, 60, 40, 30, 24]
 * <p>
 * Input 2:
 * A = [5, 1, 10, 1]
 * Output 2:
 * [10, 50, 5, 50]
 */
public class ProductArrayPuzzle {

    public static void main(String[] args) {
        System.out.println("Product Sum Array = " + solve(Arrays.asList(7, 3, 1, 5, 5, 5, 1, 2, 4, 5)));

    }

    public static ArrayList<Integer> solve(List<Integer> A) {

        ArrayList<Integer> productArray = new ArrayList<>();

        Integer totProduct = 1;

        for (int i = 0; i < A.size(); i++) {
            totProduct = totProduct * A.get(i);
        }

        for (int i = 0; i < A.size(); i++) {
            productArray.add(totProduct / A.get(i));
        }

        return productArray;
    }
}
