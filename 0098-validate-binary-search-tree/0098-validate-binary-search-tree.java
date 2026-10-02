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
    public boolean leftsubtree(TreeNode root,int val){
     if(root==null) return true;
     if(root.val>=val) return false;
     return leftsubtree(root.left,val) && leftsubtree(root.right,val);
    }
    public boolean rightsubtree(TreeNode root,int val){
     if(root==null) return true;
     if(root.val<=val) return false;
     return rightsubtree(root.left,val) && rightsubtree(root.right,val);
    }
    public boolean isValidBST(TreeNode root) {
    if(root==null) return true;
    if(!leftsubtree(root.left,root.val)) return false;
    if(!rightsubtree(root.right,root.val)) return false;
    return isValidBST(root.left) && isValidBST(root.right);
 }
}