package data.structures;

import java.util.ArrayList;
import java.util.List;

public class Tree {
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

    public static class BinarySearchTree{
        class GenerateBinaryTree {
            public List<TreeNode> generateTrees(int n) {
                List<TreeNode> binaryTrees = new ArrayList<>();
                for(int i=0; i<n; i++){

                }
                return binaryTrees;
            }
        }
    }
}
