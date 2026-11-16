class Solution {
    public void dfs(char [][] grid,boolean [][] visited,int i,int j){
        visited[i][j]=true;
        if( i>0 && grid[i-1][j]!='0' && !visited[i-1][j] ) dfs(grid,visited,i-1,j);
        if( i<grid.length-1 && grid[i+1][j]!='0' && !visited[i+1][j] ) dfs(grid,visited,i+1,j);
        if( j>0 && grid[i][j-1]!='0' && !visited[i][j-1] ) dfs(grid,visited,i,j-1);
        if( j<grid[0].length-1 && grid[i][j+1]!='0' && !visited[i][j+1] ) dfs(grid,visited,i,j+1);
    }   
    public int numIslands(char[][] grid) {
    boolean [][] visitedisland=new boolean[grid.length][grid[0].length];
    int count=0;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]=='1' && !visitedisland[i][j]){
                dfs(grid,visitedisland,i,j);
                count++;
            }
        }
    }
    return count;   
    }
}