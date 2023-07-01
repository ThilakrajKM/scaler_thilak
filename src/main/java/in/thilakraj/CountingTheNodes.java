package in.thilakraj;

public class CountingTheNodes {

    public int solve(TreeNode A) {
        Integer result = 0;
        return countingTheNodes(A, 0);
    }

    int countingTheNodes(TreeNode node, int max) {

        int result = 0;

        if (node == null) {
            return result;
        }

        if (max < node.val) {
            max = node.val;
            result = 1;
        }

        int leftResult = countingTheNodes(node.left, max);
        int rightResult = countingTheNodes(node.right, max);

        return result + leftResult + rightResult;

    }
}
