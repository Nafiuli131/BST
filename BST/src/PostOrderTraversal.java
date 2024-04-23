public class PostOrderTraversal {
    void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }
}
