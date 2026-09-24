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
     List<Integer> arr=new ArrayList<>();
     if(root==null) return arr;
     int level=level(root);
     recursion(root,arr,level);
     return arr;   
    }
    public void recursion(TreeNode root,List<Integer> arr,int level){
        int currentlevel=0;
        Stack<pair> st=new Stack<>();
        st.push(new pair(root,1));
        while(st.size()>0){
            pair top=st.pop();
            if(top.level>currentlevel){
            System.out.println(currentlevel);
            arr.add(top.node.val);
            currentlevel++;
            if(currentlevel==level){
                    break;
            }
  }
            if(top.node.left!=null) st.push(new pair(top.node.left,top.level+1));
            if(top.node.right!=null) st.push(new pair(top.node.right,top.level+1));

        }

    }
}