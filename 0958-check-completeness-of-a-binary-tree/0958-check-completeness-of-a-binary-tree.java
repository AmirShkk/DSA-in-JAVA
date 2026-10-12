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
    public int size(TreeNode root){
        return (root==null)?0:1+size(root.left)+size(root.right);
    }
    public boolean helper(TreeNode root,int nodeno,int size){
        if(root==null) return true;
        if(nodeno>size) return false;
        return helper(root.left,nodeno*2,size) && helper(root.right,nodeno*2+1,size);
    }
    public boolean isCompleteTree(TreeNode root) {
        int size=size(root);
        System.out.println(size);
        return helper(root,1,size);
    }
}