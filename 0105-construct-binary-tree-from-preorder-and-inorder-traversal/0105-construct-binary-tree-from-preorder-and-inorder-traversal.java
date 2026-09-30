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
    public TreeNode recursion(int prelo,int prehi,int inlo,int inhi,int[] preorder,int[] inorder){
        if(prelo>prehi) return null;
        int val=preorder[prelo];
        TreeNode root=new TreeNode(val);
        int count=0;
        int i=inlo;
        while(i<=inhi) {
            if(val==inorder[i]) break;
            count++;
            i++;
        }
        root.left=recursion(prelo+1,prelo+count,inlo,i-1,preorder,inorder);
        root.right=recursion(prelo+count+1,prehi,i+1,inhi,preorder,inorder);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     return recursion(0,preorder.length-1,0,inorder.length-1,preorder,inorder);    
    }
}