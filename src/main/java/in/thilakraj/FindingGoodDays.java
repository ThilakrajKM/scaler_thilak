package in.thilakraj;

/**
 * Problem Description
 * Alex has a cat named Boomer. He decides to put his cat to the test for eternity.
 * <p>
 * He starts on day 1 with one stash of food unit, every next day, the stash doubles.
 * <p>
 * If Boomer is well behaved during a particular day, only then she receives food worth equal to the stash produced on that day.
 * <p>
 * Boomer receives a net worth of A units of food. What is the number of days she received the stash?
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 231-1
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument is an integer A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the number of days Boomer was well behaved.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = 5
 * Input 2:
 * <p>
 * A = 8
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 2
 * Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * To eat a total of 5 units of food, Boomer behaved normally on Day 1 and on the Day 3.
 * Explanation 2:
 * <p>
 * To eat a total of 8 units of food, Boomer behaved normally only on day 4.
 */
public class FindingGoodDays {

    public int solve(int A) {

        int result = 0;

        while (A != 0) {
            if ((A & 1) == 1) {
                result++;
            }
            A = (A >> 1);
        }
        return result;
    }

}
