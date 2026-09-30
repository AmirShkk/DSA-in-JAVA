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
    public TreeNode recursion(int prelo,int prehi,int []preorder){
        if(prelo>prehi) return null;
        int val=preorder[prelo];
        TreeNode root=new TreeNode(val);
        int i=prelo+1;
        int count=0;
        while(i<=prehi && preorder[i]<val) {
            count++;
            i++;
        }
        root.left=recursion(prelo+1,prelo+count,preorder);
        root.right=recursion(prelo+count+1,prehi,preorder);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
      return recursion(0,preorder.length-1,preorder);   
    }
}