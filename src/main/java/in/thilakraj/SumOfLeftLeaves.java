package in.thilakraj;

/**
 * Problem Description
 * <p>
 * Given a binary tree, find and return the sum of node value of all left leaves in it.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= number of nodes <= 5 * 105
 * <p>
 * 1 <= node value <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * <p>
 * First and only argument is a pointer to the root node of the Binary Tree, A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * <p>
 * Return an integer denoting the sum of node value of all left leaves in it.
 * <p>
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * Input 2:
 * <p>
 * 1
 * / \
 * 6   2
 * /
 * 3
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1:
 * <p>
 * 24
 * Output 2:
 * <p>
 * 9
 * <p>
 * <p>
 * Example Explanation
 * <p>
 * Explanation 1:
 * <p>
 * Left leaf node in the given tree are 9 and 15. Return 24 (9 + 15).
 * Explanation 2:
 * <p>
 * Left leaf node in the given tree are 6 and 3. Return 9 (6 + 3).
 */
public class SumOfLeftLeaves {

    public int solve(TreeNode A) {
        return sumOfLeftLeaveNode(A, null);
    }

    private int sumOfLeftLeaveNode(TreeNode node, TreeNode parentNode) {
        if (node == null) {
            return 0;
        }
        int leftNodeSum = sumOfLeftLeaveNode(node.left, node);
        int rightNodeSum = sumOfLeftLeaveNode(node.right, node);

        if ((parentNode != null && parentNode.left == node) && node.left == null && node.right == null) {
            return node.val;
        }

        return leftNodeSum + rightNodeSum;

    }
}
