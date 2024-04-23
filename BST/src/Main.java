public class Main {
    public static void main(String[] args) {
        int[] values = {4,5,2,1,3,7};
        TreeNode root =null ;
        Insert insert = new Insert();
        for (int value : values) {
           root =  insert.insert(root,value);
        }
        System.out.println("Inorder Traversal");
        InorderTraversal inorderTraversal = new InorderTraversal();
        inorderTraversal.inorder(root);
        System.out.println("Postorder Traversal");
        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        preOrderTraversal.preorderTraversal(root);
    }
}