class pair{
    TreeNode node;int level;
    pair(TreeNode node,int level){
        this.node=node;
        this.level=level;
    }
}
class Solution {
    public int maxLevelSum(TreeNode root) {
    Queue<pair> que=new LinkedList<>();
    que.add(new pair(root,1));
    int currentlevel=1;
    int maxlevel=Integer.MIN_VALUE;
    int sumofcurrentlevel=0;
    int maxsum=Integer.MIN_VALUE;
    while(!que.isEmpty()){
       pair pair=que.remove();
       if(currentlevel!=pair.level){
         if(sumofcurrentlevel>maxsum){
           System.out.print(sumofcurrentlevel);
           System.out.print(maxsum);
           maxlevel=currentlevel;
           maxsum=sumofcurrentlevel;
           }
         currentlevel++;
         sumofcurrentlevel=0; 
       }
        sumofcurrentlevel+=pair.node.val;
        pair.level+=1;
        if(pair.node.left!=null) que.add(new pair(pair.node.left,pair.level));
        if(pair.node.right!=null) que.add(new pair(pair.node.right,pair.level));
    }
    if(sumofcurrentlevel>maxsum){
        maxlevel=currentlevel;
    }
    return maxlevel;    
    }
}