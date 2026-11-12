class Solution {
    public void bfs(int el,int [] visited,int [][] isConnected){
        Queue<Integer> que=new LinkedList<>();
        que.add(el);
        visited[el]=1;
        while(!que.isEmpty()){
         int i=que.remove();
            for(int j=0;j<isConnected[i].length;j++){
               if(isConnected[i][j]==1 && visited[j]!=1){
                que.add(j);
                visited[j]=1;
               }
            }
            }

    }
    public int findCircleNum(int[][] isConnected) {
    int [] visited=new int[isConnected.length];
    int count=0;
    for(int i=0;i<isConnected.length;i++){
     if(visited[i]!=1){
       bfs(i,visited,isConnected);
       count++;
    }
    }
    
    return count;
   }
}