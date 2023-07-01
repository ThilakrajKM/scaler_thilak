package in.thilakraj;

/**
 * Problem Description
 * You are given the root node of a binary tree A. You have to find the number of nodes in this tree.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= Number of nodes in the tree <= 105
 * <p>
 * 0 <= Value of each node <= 107
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first and only argument is a tree node A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the number of nodes of the tree.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * Values =  1
 * / \
 * 4   3
 * Input 2:
 * <p>
 * <p>
 * Values =  1
 * / \
 * 4   3
 * /
 * 2
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 3
 * Output 2:
 * <p>
 * 4
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Clearly, there are 3 nodes 1, 4 and 3.
 * Explanation 2:
 * <p>
 * Clearly, there are 4 nodes 1, 4, 3 and 2.
 */
public class NodeCount {

    public int solve(TreeNode A) {
        return numberOfNodes(A);
    }

    public int numberOfNodes(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftNodeCount = numberOfNodes(node.left);
        int rightNodeCount = numberOfNodes(node.right);

        return leftNodeCount + rightNodeCount + 1;
    }
}
