package in.thilakraj;

import java.util.ArrayList;

/**
 * Problem Description
 * Given a binary tree, return the preorder traversal of its nodes values.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= number of nodes <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument is root node of the binary tree, A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer array denoting the preorder traversal of the given binary tree.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * 1
 * \
 * 2
 * /
 * 3
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
 * Output 1:
 * <p>
 * [1, 2, 3]
 * Output 2:
 * <p>
 * [1, 6, 2, 3]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * The Preoder Traversal of the given tree is [1, 2, 3].
 * Explanation 2:
 * <p>
 * The Preoder Traversal of the given tree is [1, 6, 2, 3].
 */
public class PreOrderTraversal {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        preOrdrTraversal(A, result);
        return result;
    }

    private void preOrdrTraversal(TreeNode node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val);
        preOrdrTraversal(node.left, result);
        preOrdrTraversal(node.right, result);
    }
}
