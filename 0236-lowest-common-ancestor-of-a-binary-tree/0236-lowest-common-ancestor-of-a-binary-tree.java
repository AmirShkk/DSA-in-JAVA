/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// class Solution {
//     public boolean exist(TreeNode root,TreeNode k){
//         if(root==null) return false;
//         if(root==k) return true;
//         return exist(root.left,k) || exist(root.right,k);
    
// }
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//      if( root==p || root==q ) return root;
//      boolean pnode=exist(root.left,p);
//      boolean qnode=exist(root.right,q);
//      if(pnode && !qnode) return lowestCommonAncestor(root.left,p,q);
//      if(!pnode && qnode)  return lowestCommonAncestor(root.right,p,q);
//      return root;
//     }
// }
class Solution{
    public void exist(TreeNode root,TreeNode p,TreeNode q,List<List<TreeNode>> arr,List<TreeNode> innerarr){
        if(root==null) return;
        innerarr.add(root);
        if(root==p || root==q){
          arr.add(new ArrayList<>(innerarr));
        }
        exist(root.left,p,q,arr,innerarr);
        exist(root.right,p,q,arr,innerarr);
        innerarr.remove(innerarr.size()-1);
    }
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        List<List<TreeNode>> arr=new ArrayList<>();
        exist(root,p,q,arr,new ArrayList<TreeNode>());
        int i=0;
        while(i<arr.get(0).size() && i<arr.get(1).size() && arr.get(0).get(i)==arr.get(1).get(i)){
            i++;
        }
          return arr.get(0).get(i-1);
  }
}