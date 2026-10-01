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
 // using arraylist
// class Solution {
//     public void helper(ArrayList<Integer> arr,TreeNode root){
//      if(root==null)  return;
//      helper(arr,root.left);
//      arr.add(root.val);
//      helper(arr,root.right);
//      return;
//     }
//     public int kthSmallest(TreeNode root, int k) {
//     ArrayList<Integer> arr=new ArrayList<>();
//     helper(arr,root);
//     return arr.get(k-1);
//     }
// }
  class Solution{
    static int ans=-1;
    static int k2;
    public void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        k2--;
        if(k2==0){
            ans=root.val;
        }
        helper(root.right);
    }
    public int kthSmallest(TreeNode root,int k){
     k2=k;
     helper(root);
     return ans;
     
     
    }
  }