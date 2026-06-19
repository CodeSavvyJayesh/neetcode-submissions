/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // in this problem again i have to do dfs 
        return sum(root,targetSum,0);
    }
    private boolean sum(TreeNode node,int targetSum,int currentSum)
    {
         if(node==null) return false;

         currentSum += node.val;

         // if its leaf node 
         if(node.left ==null && node.right==null)
         {
             return currentSum == targetSum;
         }

         return sum(node.left,targetSum,currentSum) || sum(node.right,targetSum,currentSum);


    }
}