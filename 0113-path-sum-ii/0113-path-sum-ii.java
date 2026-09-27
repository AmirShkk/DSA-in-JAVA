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
    public void recursion(TreeNode root,int targetsum,List<List<Integer>> arr,List<Integer> innerarr){
        if(root==null) return;
         innerarr.add(root.val);
        if(root.left==null && root.right==null){
            targetsum-=root.val;
            if(targetsum==0){
                arr.add(new ArrayList<>(innerarr));
                innerarr.remove(innerarr.size()-1);
                return;
            }
        }
        recursion(root.left,targetsum-root.val,arr,innerarr);
        recursion(root.right,targetsum-root.val,arr,innerarr);
        innerarr.remove(innerarr.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    List<List<Integer>> arr=new ArrayList<>();
    recursion(root,targetSum,arr,new ArrayList<Integer>());
    return arr;    
    }
}