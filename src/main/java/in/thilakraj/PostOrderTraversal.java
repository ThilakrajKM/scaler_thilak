package in.thilakraj;

import java.util.ArrayList;

/**
 * Problem Description
 * Given a binary tree, return the Postorder traversal of its nodes values.
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
 * Return an integer array denoting the Postorder traversal of the given binary tree.
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
 * [3, 2, 1]
 * Output 2:
 * <p>
 * [6, 3, 2, 1]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * The Preoder Traversal of the given tree is [3, 2, 1].
 * Explanation 2:
 * <p>
 * The Preoder Traversal of the given tree is [6, 3, 2, 1].
 */
public class PostOrderTraversal {

    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        postTraversal(A, result);
        return result;
    }

    private void postTraversal(TreeNode node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }
        postTraversal(node.left, result);
        postTraversal(node.right, result);
        result.add(node.val);
    }
}
