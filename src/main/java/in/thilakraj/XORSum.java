package in.thilakraj;

/**
 * Problem Description
 * Given two integers A and B. Find the minimum value (A ⊕ X) + (B ⊕ X) that can be achieved for any X.
 * <p>
 * where P ⊕ Q is the bitwise XOR operation of the two numbers P and Q.
 * <p>
 * Note: Bitwise XOR operator will return 1, if both bits are different. If bits are same, it will return 0.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A, B <= 109
 * <p>
 * <p>
 * Input Format
 * The first argument is a single integer A.
 * The second argument is a single integer B.
 * <p>
 * <p>
 * Output Format
 * Return the minimum value (A ⊕ X) + (B ⊕ X) that can be achieved for any X.
 * <p>
 * <p>
 * Example Input
 * Input 1:-
 * A = 6
 * B = 12
 * Input 2:-
 * A = 4
 * B = 9
 * <p>
 * <p>
 * Example Output
 * Output 1:-
 * 10
 * output 2:-
 * 13
 * <p>
 * <p>
 * Example Explanation
 * Expanation 1:-
 * X ^ A + X ^ B = 10 when X = 4
 * Explanation 2:-
 * X ^ A + X ^ B = 13 when X = 0
 */
public class XORSum {

    public static void main(String[] args) {
        System.out.println("Ans : " + solve(6, 12));
    }

    public static int solve(int A, int B) {

        int AandB = A & B;
        return (A ^ AandB) + (B ^ AandB);
    }
}
