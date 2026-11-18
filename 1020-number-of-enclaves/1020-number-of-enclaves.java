class Solution {
    static boolean boundaryele=false;
    public int dfs(int [][] grid,boolean [][] visited,int i,int j){
        visited[i][j]=true;
        if( !boundaryele && (i==0 || j==0 || j==grid[i].length-1 || i==grid.length-1)) boundaryele=true;
        int left=(i>0 && grid[i-1][j]==1 && !visited[i-1][j])?dfs(grid,visited,i-1,j):0;
        int right=(i<grid.length-1 && grid[i+1][j]==1 && !visited[i+1][j])?dfs(grid,visited,i+1,j):0;
        int top=(j>0 && grid[i][j-1]==1 && !visited[i][j-1])?dfs(grid,visited,i,j-1):0;
        int bottom=(j<grid[i].length-1 && grid[i][j+1]==1 && !visited[i][j+1])?dfs(grid,visited,i,j+1):0;
        return 1+left+right+top+bottom;
    }
    public int numEnclaves(int[][] grid) {
    boolean [][] visited=new boolean[grid.length][grid[0].length];
    int totalcount=0;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]==1 && !visited[i][j]){
                int count=dfs(grid,visited,i,j);
                if(!boundaryele) totalcount+=count;
            }
            boundaryele=false;
            }
    }
    return totalcount;    
    }
}