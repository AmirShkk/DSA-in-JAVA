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
    public void helper(ArrayList<Integer> arr,TreeNode root){
     if(root==null)  return;
     helper(arr,root.left);
     arr.add(root.val);
     helper(arr,root.right);
     return;
    }
    public int kthSmallest(TreeNode root, int k) {
    ArrayList<Integer> arr=new ArrayList<>();
    helper(arr,root);
    return arr.get(k-1);
    }
}