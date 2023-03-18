package in.thilakraj;

import java.util.Arrays;

/**
 * 1.
 *
 * Given an integer A, you need to find the count of it's factors.
 *
 * Factor of a number is the number which divides it perfectly leaving no remainder.
 *
 * Example : 1, 2, 3, 6 are factors of 6
 *
 * 1 <= A <= 10^9
 */
public class CountFactors {

    public static void main(String[] args) {

        System.out.println("Factor Count of 5= " + solve(5));
        System.out.println("Factor Count of 10 = " + solve(10));
    }

    public static int solve(int A) {
        int result = 0;

        for (int i= 1; i <= A/i; i++) {

            if(A%i == 0) {

                if(i == A/i) {
                    result++;
                }else {
                    result +=2;
                }
            }

        }
        return result;
    }

}
