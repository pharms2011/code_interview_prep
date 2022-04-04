package algo;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {



    class BinaryTreeInorderTraversal{
        /**
         * Definition for a binary tree node.
         * * **/
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
        /*
            Runtime: 1 ms, faster than 42.78% of Java online submissions for Binary Tree Inorder Traversal.
            Memory Usage: 42.4 MB, less than 42.57% of Java online submissions for Binary Tree Inorder Traversal.
        * */
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList();
            TreeNode leftTree = root.left;
            if(leftTree != null){
                result.addAll(inorderTraversal(leftTree));
            }
            result.add(root.val);
            TreeNode right= root.right;
            if(right != null){
                result.addAll(inorderTraversal(right));
            }
            return result;
        }
    }
}
