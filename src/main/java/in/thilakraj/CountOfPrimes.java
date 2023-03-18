package in.thilakraj;

import java.util.Arrays;

/**
 * 5. Count of primes
 *
 * Problem Description : You will be given an integer n.
 * You need to return the count of prime numbers less than or equal to n.
 *
 * Problem Constraints : 0 <= n <= 10^3
 *
 * Input Format : Single input parameter n in function.
 * Output Format : Return the count of prime numbers less than or equal to n.
 *
 * Input 1: 19
 * Input 2: 1
 *
 * Output 1: 8
 * Output 2: 0
 *
 * Explanation 1: Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19
 * Explanation 2: There are no primes <= 1
 */
public class CountOfPrimes {

    public static void main(String[] args) {

        System.out.println("Number of primes : 19   = " + solve(19));
        System.out.println("Number of primes : 1   = " + solve(1));

    }

    public static int solve(int A) {

        int totalPrime = 0;

        for (int i =2; i<=A; i++){
            if(isPrime(i)==1){
                totalPrime++;
            }
        }

        return totalPrime;
    }

    public static int isPrime(int n) {
        int countFactors = 0;
        for( int j=1; j<=n/j ; j++){
            if(n%j==0){
                countFactors +=2;
            }
        }
        return countFactors > 2 ? 0 : 1;
    }
}
