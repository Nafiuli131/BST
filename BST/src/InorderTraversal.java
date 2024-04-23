public class InorderTraversal {
    /**
     *
     * @param root
     * this traversal method prints acceding order sorting
     */
    void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);

    }
}
