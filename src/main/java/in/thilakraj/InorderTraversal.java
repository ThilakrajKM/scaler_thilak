package in.thilakraj;

import java.util.ArrayList;

public class InorderTraversal {

    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        inOrdrTraversal(A, result);
        return result;
    }

    private void inOrdrTraversal(TreeNode node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }
        inOrdrTraversal(node.left, result);
        result.add(node.val);
        inOrdrTraversal(node.right, result);
    }


}
