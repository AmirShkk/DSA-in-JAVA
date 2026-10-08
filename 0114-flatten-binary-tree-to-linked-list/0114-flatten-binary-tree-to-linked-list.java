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
    // public void flatten(TreeNode root) {
    //  if( root==null || (root.left==null && root.right==null) ) return;
    //  TreeNode t=root.right;
    //  flatten(root.left);
    //  flatten(root.right);
    //  root.right=root.left;
    //  root.left=null;

    //  while(root.right!=null) root=root.right;
    //  root.right=t;
    // }
     public void flatten(TreeNode root){
        while(root!=null){
        if(root.left!=null){
           TreeNode pre=root.left;
           while(pre.right!=null) pre=pre.right;
           pre.right=root.right;
           root.right=root.left;
           root.left=null;
           root=root.right;
        }
        else{
            while(root!=null) {
                if(root.left==null) root=root.right;
                else break;
        }
        }
     }
}
}