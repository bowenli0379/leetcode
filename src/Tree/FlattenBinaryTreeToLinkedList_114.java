package Tree;

public class FlattenBinaryTreeToLinkedList_114 {
        public static TreeNode flatten(TreeNode root){
            if (root == null)
                return null;
            flatten(root.left);
            flatten(root.right);
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = null;
            while (root.right != null)
                root = root.right;
            root.right = temp;
            return root;
        }
        public static void main(String[] args){
            TreeNode treeNode1 = new TreeNode(1);
            TreeNode treeNode2 = new TreeNode(2);
            TreeNode treeNode3 = new TreeNode(5);
            TreeNode treeNode4 = new TreeNode(3);
            TreeNode treeNode5 = new TreeNode(4);
            TreeNode treeNode6 = new TreeNode(6);
            treeNode1.left = treeNode2;
            treeNode1.right = treeNode3;
            treeNode2.left = treeNode4;
            treeNode2.right = treeNode5;
            treeNode3.right = treeNode6;
            System.out.println(flatten(treeNode1));
        }

}
