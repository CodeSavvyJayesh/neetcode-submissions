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
    private int postIndex;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length-1;
        for(int i=0;i<inorder.length;i++)
        {
             map.put(inorder[i],i);
        }

        return helper(postorder,0,inorder.length-1);
        
    }
    public TreeNode helper(int [] postorder, int left, int right)
    {
         if(left>right ) return null;
         // find the root 
         int rootVal = postorder[postIndex--];
         // create root node 
         TreeNode root = new TreeNode(rootVal);
         // find the position of root 
         int mid = map.get(rootVal);
         // build the rightsubtree
         root.right = helper(postorder,mid+1,right);
         // build the left subtree
          root.left = helper(postorder,left,mid-1);

          return root;
    }
}