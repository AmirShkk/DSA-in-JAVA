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
    pair(TreeNode root,int level){
        this.node=root;
        this.level=level;
    }
 }
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    Queue<pair> que=new LinkedList<>();
    List<List<Integer>> outerarr=new ArrayList<>();
    List<Integer> innerarr=new ArrayList<>();
    if(root==null) return outerarr;
    que.add(new pair(root,0));
    int lvl=0;
    while(!que.isEmpty()){
    pair t=que.remove();
    if(lvl!=t.level){
       outerarr.add(new ArrayList<>(List.copyOf(innerarr)));
       innerarr.clear();
       lvl++;
    }
    innerarr.add(t.node.val);
    if(t.node.left!=null) que.add(new pair(t.node.left,lvl+1));
    if(t.node.right!=null) que.add(new pair(t.node.right,lvl+1));
    }
    outerarr.add(new ArrayList<>(List.copyOf(innerarr)));
    return outerarr;
    
    }    
    }
