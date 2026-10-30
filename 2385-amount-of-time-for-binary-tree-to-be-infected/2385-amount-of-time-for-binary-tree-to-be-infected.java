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
    static TreeNode startnode=null;
    public int burntree(TreeNode root,HashMap<TreeNode,TreeNode> hm,HashSet<Integer> hs){
        if(root==null) return 0;
        hs.add(root.val);
        int par=(hm.containsKey(root) && !hs.contains(hm.get(root).val))?burntree(hm.get(root),hm,hs):0;
        int left=(root.left!=null && !hs.contains(root.left.val))?burntree(root.left,hm,hs):0;
        int right=(root.right!=null && !hs.contains(root.right.val))?burntree(root.right,hm,hs):0;
        return 1+Math.max(par,Math.max(left,right));
    }
    public void parentconnection(TreeNode root,HashMap<TreeNode,TreeNode> hm,int start){
        if(root.val==start) startnode=root; 
        if(root.left==null && root.right==null) return;
        if(root.left!=null){
            hm.put(root.left,root);
            parentconnection(root.left,hm,start);
        }
        if(root.right!=null){
            hm.put(root.right,root);
            parentconnection(root.right,hm,start);
        }
    }
    public int amountOfTime(TreeNode root, int start) {
    HashMap<TreeNode,TreeNode> hm=new HashMap<>();
    HashSet<Integer> hs=new HashSet<>();
    parentconnection(root,hm,start); 
    int min=burntree(startnode,hm,hs);
    return --min;
    }
}