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
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftlevel=height(root.left);
        int rightlevel=height(root.right);
        if(leftlevel!=-1 && rightlevel!=-1 && Math.abs(leftlevel-rightlevel)<=1){
            return 1+Math.max(height(root.left),height(root.right));
        }
        return -1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(height(root)==-1) return false;
        return true; 
    }
}