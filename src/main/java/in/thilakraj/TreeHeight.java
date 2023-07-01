package in.thilakraj;

/**
 * Problem Description
 * You are given the root node of a binary tree A. You have to find the height of the given tree.
 * <p>
 * A binary tree's height is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= Number of nodes in the tree <= 105
 * <p>
 * 0 <= Value of each node <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first and only argument is a tree node A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the height of the tree.
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
 * 2
 * Output 2:
 * <p>
 * 3
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Distance of node having value 1 from root node = 1
 * Distance of node having value 4 from root node = 2 (max)
 * Distance of node having value 3 from root node = 2 (max)
 * Explanation 2:
 * <p>
 * Distance of node having value 1 from root node = 1
 * Distance of node having value 4 from root node = 2
 * Distance of node having value 3 from root node = 2
 * Distance of node having value 2 from root node = 3 (max)
 */
public class TreeHeight {

    public int solve(TreeNode A) {
        return treeHeight(A);
    }

    private int treeHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftTreeHeight = treeHeight(node.left);
        int rightTreeHeight = treeHeight(node.right);
        return 1 + ((leftTreeHeight > rightTreeHeight) ? leftTreeHeight : rightTreeHeight);
    }

}
