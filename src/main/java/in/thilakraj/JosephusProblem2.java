package in.thilakraj;

/**
 * Problem Description
 * There are A people standing in a circle. Person 1 kills their immediate clockwise neighbour and pass the knife to the next person standing in circle. This process continues till there is only 1 person remaining. Find the last person standing in the circle.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 105
 * <p>
 * <p>
 * Input Format
 * First argument A is an integer.
 * <p>
 * <p>
 * Output Format
 * Return an integer.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = 4
 * Input 2:
 * A = 5
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * 3
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * Firstly, the person at position 2 is killed, then the person at position 4 is killed,
 * then the person at position 3 is killed. So the person at position 1 survives.
 * For Input 2:
 * <p>
 * Firstly, the person at position 2 is killed, then the person at position 4 is killed,
 * then the person at position 1 is killed. Finally, the person at position 5 is killed.
 * So the person at position 3 survives.
 */
public class JosephusProblem2 {

    public static void main(String[] args) {
        System.out.println("Ans : " + solve(8));
    }

    public static int solve(int A) {

        int nearestPowerOf2 = 1;

        for (; nearestPowerOf2 * 2 <= A; nearestPowerOf2 *= 2) ;


        return 1 + (2 * (A - nearestPowerOf2));

    }
}
