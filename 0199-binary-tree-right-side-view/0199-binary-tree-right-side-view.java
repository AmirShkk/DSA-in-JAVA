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
class pair{
    TreeNode node;
    int level;
    pair(TreeNode node, int level){
        this.node=node;
        this.level=level;
    }
}
class Solution {
    public int level(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public List<Integer> rightSideView(TreeNode root) {
    int level=level(root);
     List<Integer> arr=new ArrayList<>(Collections.nCopies(level,0));
    if(root==null) return arr;
    recursion(root,arr,0);
    return arr;   
    }
    public void recursion(TreeNode root,List<Integer> arr,int level){
        if(root==null) return ;
        arr.set(level,root.val);
        recursion(root.left,arr,level+1);
        recursion(root.right,arr,level+1);
    }

    }