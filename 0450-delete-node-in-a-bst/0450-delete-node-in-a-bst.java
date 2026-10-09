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
 // overwriting the value 
// class Solution {
//     public void pre(TreeNode root){
//         TreeNode pre=root.left;
//         if(pre.right==null) {
//             root.val=pre.val;
//             root.left=root.left.left;
//             return;
//         }
//         while( pre.right.right!=null) pre=pre.right;
//         root.val=pre.right.val;
//         pre.right=pre.right.left;
//     }
//      public void suc(TreeNode root){
//         TreeNode pre=root.right;
//         if(pre.left==null) {
//             root.val=pre.val;
//             root.right=root.right.right;
//             return;
//         }
//         while( pre.left.left!=null) pre=pre.left;
//         root.val=pre.left.val;
//         pre.left=pre.left.right;
        
//     }
//     public TreeNode deleteNode(TreeNode root, int key) {
//         // code here
//     if(root==null) return null;
//     if(root.val<key) root.right=deleteNode(root.right,key);
//     else if(root.val>key) root.left=deleteNode(root.left,key);
//     else{
//         if(root.left==null && root.right==null) return null;
//         else if(root.left==null) suc(root);
//         else pre(root);
//     }
//     return root;
//     }
// }
// actually changing the connection
class Solution{
    public TreeNode deleteNode(TreeNode root,int key){
        if(root==null) return null;
        if(root.val<key) root.right=deleteNode(root.right,key);
        else if(root.val>key) root.left=deleteNode(root.left,key);
        else{
            if(root.left==null && root.right==null) return null;
            if(root.right==null) return root.left;
            if(root.left==null) return root.right;
            TreeNode pre=root.left;
            while(pre.right!=null) pre=pre.right;
            root.left=deleteNode(root.left,pre.val);
            pre.left=root.left;
            pre.right=root.right;
            return pre;
        }
        return root;
    }
}