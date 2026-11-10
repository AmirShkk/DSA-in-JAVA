// class pair{
//     TreeNode node;int level;
//     pair(TreeNode node,int level){
//         this.node=node;
//         this.level=level;
//     }
// }
// class Solution {
//     public int maxLevelSum(TreeNode root) {
//     Queue<pair> que=new LinkedList<>();
//     que.add(new pair(root,1));
//     int currentlevel=1;
//     int maxlevel=Integer.MIN_VALUE;
//     int sumofcurrentlevel=0;
//     int maxsum=Integer.MIN_VALUE;
//     while(!que.isEmpty()){
//        pair pair=que.remove();
//        if(currentlevel!=pair.level){
//          if(sumofcurrentlevel>maxsum){
//            System.out.print(sumofcurrentlevel);
//            System.out.print(maxsum);
//            maxlevel=currentlevel;
//            maxsum=sumofcurrentlevel;
//            }
//          currentlevel++;
//          sumofcurrentlevel=0; 
//        }
//         sumofcurrentlevel+=pair.node.val;
//         pair.level+=1;
//         if(pair.node.left!=null) que.add(new pair(pair.node.left,pair.level));
//         if(pair.node.right!=null) que.add(new pair(pair.node.right,pair.level));
//     }
//     if(sumofcurrentlevel>maxsum){
//         maxlevel=currentlevel;
//     }
//     return maxlevel;    
//     }
// }
class Solution{
    public int maxLevelSum(TreeNode root){
        if(root==null) return -1;
        List<Integer> arr=new ArrayList<>();
        dfs(root,0,arr);
        int maxlevel=-1;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>maxsum){
                maxlevel=i;
                maxsum=arr.get(i);
            }
        }
        return maxlevel+1;
    }
    public void dfs(TreeNode root,int level,List<Integer> arr){
        if(root==null) return;
        if(level>=arr.size()){
            arr.add(level,root.val);
        }
        else{
            arr.set(level,arr.get(level)+root.val);
        }
        level=level+1;
        dfs(root.left,level,arr);
        dfs(root.right,level,arr);
    }
}