using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace code_interview_prep_csharp.DFS
{

//Runtime: 193 ms, faster than 83.26% of C# online submissions for Range Sum of BST.
//Memory Usage: 48.2 MB, less than 53.56% of C# online submissions for Range Sum of BST.

    public class TreeNode
    {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val = 0, TreeNode left = null, TreeNode right = null)
        {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class RangeSum
    {
        public static int RangeSumBST(TreeNode root, int low, int high)
        {
            int sum = 0;
            if(isInRange(root.val, low,high)){
                sum+=root.val;    
            }
            if(root.right != null){
                sum+=RangeSumBST(root.right, low,high);
            }

            if(root.left != null){
                sum+=RangeSumBST(root.left, low,high);
            }
            return sum;
        }

        public static bool isInRange(int val, int low, int high){
            return val >= low && val<=high;
        }

         static void Main(string[] args){
            TreeNode root = new TreeNode(10);
            TreeNode a = new TreeNode(5);
            TreeNode b = new TreeNode(15);
            root.left = a;
            root.right = b;

            TreeNode c = new TreeNode(3);
            TreeNode d = new TreeNode(7);
            a.left = c;
            a.right = d;

            TreeNode e = new TreeNode(18);
            b.right = e;

            Console.Write(RangeSum.RangeSumBST(root, 7,15));
         }
    }


}