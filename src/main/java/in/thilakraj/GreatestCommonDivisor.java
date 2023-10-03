package in.thilakraj;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println();
    }


    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
