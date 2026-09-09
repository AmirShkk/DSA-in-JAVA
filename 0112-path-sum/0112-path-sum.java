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
     if(root==null) return false;
     else return path(root,targetSum);
     
  }
    public boolean path(TreeNode root,int targetSum){
        if(root.left ==null && root.right==null){
        if(targetSum-root.val==0) return true;
        else return false;
      }
      if(root.left==null) return path(root.right,targetSum-root.val);
      if(root.right==null) return path(root.left,targetSum-root.val);
      return path(root.left,targetSum-root.val) || path(root.right,targetSum-root.val);
    }
}