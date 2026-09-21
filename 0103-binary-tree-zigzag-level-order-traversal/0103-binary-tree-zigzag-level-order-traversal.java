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
public class pair{
    TreeNode n;
    int lvl;
    pair(TreeNode n,int lvl){
        this.n=n;
        this.lvl=lvl;
    }
}
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> arr=new ArrayList<>();
    if (root == null) return arr;
    Queue<pair> que=new LinkedList<>();
    que.add(new pair(root,0));
    int currentlvl=-1;
    while(que.size()>0){
        if(que.peek().lvl!=currentlvl){
            Stack<pair> st=new Stack<>();
            while(que.size()!=0){
            st.push(que.remove());
        }
           while(st.size()!=0){
            que.add(st.pop());
           }
           currentlvl++;
           arr.add(new ArrayList<Integer>());
        }
    pair front = que.remove();
    arr.get(currentlvl).add(front.n.val);
       if(currentlvl%2==0){
        
         if(front.n.left!=null) que.add(new pair(front.n.left, front.lvl+1));
          if(front.n.right!=null) que.add(new pair(front.n.right, front.lvl+1));
            }
        else{
           if(front.n.right!=null) que.add(new pair(front.n.right, front.lvl+1));
           if(front.n.left!=null) que.add(new pair(front.n.left, front.lvl+1));
           
            }
    }
    return arr;
}
}