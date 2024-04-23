public class Insert {
    TreeNode insert(TreeNode root,int value){
        if(root==null){
            TreeNode node = new TreeNode(value);
            return node;
        }if(root.value>value){
           root.left = insert(root.left, value);
        }if(root.value<value){
           root.right = insert(root.right,value);
        }
        return root;
    }
}
