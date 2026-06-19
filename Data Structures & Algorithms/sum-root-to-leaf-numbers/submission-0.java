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
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
    private int dfs(TreeNode node, int current)
    {
         // basically my current is prev node * 10 + node 
         if(node==null) return 0;

         // i have to calculate my current 
         current = current*10+node.val;

         if(node.left==null && node.right==null)
         return current;

         return dfs(node.left,current) + dfs(node.right,current);
    }
}