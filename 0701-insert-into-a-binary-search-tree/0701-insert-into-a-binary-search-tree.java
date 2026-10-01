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
    public void helper(TreeNode root,int val){
     if( (root.left==null && root.right==null) || (val<root.val && root.left==null) || (val>root.val && root.right==null)){
        TreeNode t=new TreeNode(val);
        if(val<root.val) root.left=t;
        else root.right=t;
        return;
     }    
     if(val>root.val)  helper(root.right,val);
     else helper(root.left,val);
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
      if(root==null){
        TreeNode t=new TreeNode(val);
        return t;
     }    
     helper(root,val);

     return root;
    }
}