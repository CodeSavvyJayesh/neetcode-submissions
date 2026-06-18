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
    private int preIndex = 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // here we have to build the tree from preorder and inorder 
        // we have to store all the elemeent of inorder in map 
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        // basically we have store the element and its index 
        // we will need it 
        return helper(preorder,0,inorder.length-1);
    }
    private TreeNode helper(int [] preorder, int left,int right){
        if(left>right) return null;
        // take the next root from the preorder 
        int rootVal = preorder[preIndex++];
        // create the root 
        TreeNode root = new TreeNode(rootVal);

        // we have to find the root position in inorder
        int mid = map.get(rootVal);

        // build the left subtree 
        root.left = helper(preorder,left,mid-1);

        // build the right subtree
        root.right = helper(preorder,mid+1,right);

        return root;
    }
}
