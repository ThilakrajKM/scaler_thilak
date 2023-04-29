package in.thilakraj;

/**
 * 2.
 * <p>
 * Given an Integer A. Return 1 if A is prime and return 0 if not.
 * <p>
 * 1 <= A <= 1012
 */
public class IsPrime {

    public static void main(String[] args) {

        System.out.println("is a Prime 5 = " + solve(5L));
        System.out.println("is a Prime 10 = " + solve(10L));
        System.out.println("is a Prime 1 = " + solve(1L));
    }

    public static int solve(Long A) {
        int result = 0;
        for (int i = 1; i <= A / i; i++) {

            if (A % i == 0) {
                if (i == A / i) {
                    result++;
                } else {
                    result += 2;
                }
            }

        }
        return result == 2 ? 1 : 0;
    }

}

//Edge Case 1 : 1 is not a prime number