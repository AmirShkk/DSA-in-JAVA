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
    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> arr=new ArrayList<>();
    if(root==null) return arr;
    Stack<TreeNode> st=new Stack<>();
        st.push(root);
        TreeNode curr=root;
        while(st.size()>0){
            if(curr.left!=null){
                curr=curr.left;
                st.push(curr);
            }
            else{
                TreeNode top=st.pop();
                arr.add(top.val);
                if(top.right!=null) {
                    st.push(top.right);
                    curr = top.right;
                }
            }
        }
    return arr;        
    }
}