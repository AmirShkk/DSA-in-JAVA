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
    public TreeNode recursion(int inlo,int inhi,int postlo,int posthi,int []inorder,int []postorder){
        if(inlo>inhi) return null;
  
        int val=postorder[posthi];
        TreeNode root=new TreeNode(val);
        int count=0;
        int i=inlo;
        while(inorder[i]!=val){
            count++;
            i++;
        }
        root.left=recursion(inlo,i-1,postlo,postlo+count-1,inorder,postorder);
        root.right=recursion(i+1,inhi,postlo+count,posthi-1,inorder,postorder);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
      return recursion(0,inorder.length-1,0,postorder.length-1,inorder,postorder);  
    }
}