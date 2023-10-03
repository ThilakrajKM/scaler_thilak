package in.thilakraj;

import java.util.ArrayList;

/**
 * Problem Description
 * Given an integer A. Find the list of all prime numbers in the range [1, A].
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 106
 * <p>
 * <p>
 * <p>
 * Input Format
 * Only argument A is an integer.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a sorted array of prime number in the range [1, A].
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = 7
 * Input 2:
 * A = 12
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * [2, 3, 5, 7]
 * Output 2:
 * [2, 3, 5, 7, 11]
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * The prime numbers from 1 to 7 are 2, 3, 5 and 7.
 * For Input 2:
 * The prime numbers from 1 to 12 are 2, 3, 5, 7 and 11.
 */
public class FindAllPrimeNumbers {


    public int[] solve(int A) {

        int[] numbers = new int[A + 1];
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(1);
        for (int i = 2; i <= A; i++) {
            if (numbers[i] == 0 && isAPrimeNumber(i)) {
                primeNumbers.add(i);
                for (int j = 1; j * i <= A; j++) {
                    numbers[j * i] = 1;
                }
            }
        }
        return primeNumbers.stream().mapToInt(i -> i).toArray();
    }

    boolean isAPrimeNumber(int number) {

        int factors = 0;

        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                if (i == number / i) {
                    factors++;
                } else {
                    factors += 2;
                }
            }
        }

        return factors == 2;
    }
}
