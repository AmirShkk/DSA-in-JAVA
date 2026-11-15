class Solution {
    public void dfs(int el,int [] visited,int [][] isConnected){
    visited[el]=1;
    for(int i=0;i<isConnected.length;i++){
       if( isConnected[el][i]==1 && visited[i]!=1){
          dfs(i,visited,isConnected);
       }
    } 
}
    public int findCircleNum(int[][] isConnected) {
    int [] visited=new int[isConnected.length];
    int count=0;
    for(int i=0;i<isConnected.length;i++){
     if(visited[i]!=1){
       dfs(i,visited,isConnected);
       count++;
    }
    }
    return count;
   }
}