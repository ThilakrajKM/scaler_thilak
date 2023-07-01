package in.thilakraj;

/**
 * Problem Description
 * Given the root of a binary tree A. Return the sum of all the nodes of the binary tree.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= Number of nodes in A <= 104
 * <p>
 * 1 <= value of each node <= 104
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is the root of binary tree A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the sum of all the nodes
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A =   2
 * / \
 * 1   4
 * /
 * 5
 * <p>
 * <p>
 * Input 2:
 * <p>
 * A =   3
 * / \
 * 6  1
 * \   \
 * 2   7
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 12
 * Output 2:
 * <p>
 * 19
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * The sum of all the nodes is 12
 * Explanation 2:
 * <p>
 * The sum of all the nodes is 19
 */
public class SumOfNodesOfBinTree {

    public int solve(TreeNode A) {
        return sumOfNodes(A);
    }

    public int sumOfNodes(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int leftSumNodes = sumOfNodes(node.left);
        int rightSumNodes = sumOfNodes(node.right);

        return node.val + leftSumNodes + rightSumNodes;
    }
}
