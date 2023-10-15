package in.thilakraj;

/**
 *
 */
public class AthMagicalNumber {

    public static void main(String[] args) {
        System.out.println(solve(19, 11, 13));
    }

    public static int solve(int A, int B, int C) {
        long low = 1, high = (B < C) ? (long) A * B : (long) A * C, mid;
        long lcm = ((long) C * B) / gcd(C, B);
        long ans = high;

        while (low <= high) {
            mid = low + high / 2;
            long count = divTermCount(C, B, lcm, mid);
            if (count == A) {
                ans = mid;
                high = mid - 1;
            } else if (count < A)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return (int) (ans % 1000000007);

    }

    public static long divTermCount(long a, long b, long lcm, long num) {
        return (num / a) + (num / b) - (num / lcm);
    }

    public static long gcd(long a, long b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
