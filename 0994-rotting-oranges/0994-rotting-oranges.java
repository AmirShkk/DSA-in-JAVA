class pair{
    int i;int j;int min;
    pair(int i,int j,int min){
        this.i=i;
        this.j=j;
        this.min=min;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
    Queue<pair> que=new LinkedList();
    int currentmin=0;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]==2){
             que.add(new pair(i,j,0));
        }}}
    while(!que.isEmpty()){
     pair front=que.remove();
     int i=front.i;int j=front.j;
     if(currentmin!=front.min) currentmin++;
     if( i>0 && grid[i-1][j]==1) {
        que.add(new pair(i-1,j,front.min+1));
        grid[i-1][j]=2;
     }
     if(i<grid.length-1 && grid[i+1][j]==1){
        que.add(new pair(i+1,j,front.min+1));
        grid[i+1][j]=2;
     }
     if(j>0 && grid[i][j-1]==1){
        que.add(new pair(i,j-1,front.min+1));
        grid[i][j-1]=2;
     }
     if(j<grid[i].length-1 && grid[i][j+1]==1) {
        que.add(new pair(i,j+1,front.min+1));
        grid[i][j+1]=2;
    }
    }
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]==1) return -1;
        }
    }
    return currentmin;
    }
}