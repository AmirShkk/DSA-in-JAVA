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
    public List<String> binaryTreePaths(TreeNode root) {
    ArrayList<String> str=new ArrayList<>();
    path(root,str,"");
    return str;    
    }
    public void path(TreeNode root,List<String> str,String path){
        if(root==null) return ;
        if(root.left==null && root.right==null){
            path+=root.val;
            str.add(path);
            return;
        }
        path(root.left,str,path+root.val+"->");
        path(root.right,str,path+root.val+"->");
    }
}