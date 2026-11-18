// DFS
class Solution {
    static boolean boundaryele=false;
    public int dfs(int [][] grid,int i,int j){
        grid[i][j]=-1;
        if( !boundaryele && (i==0 || j==0 || j==grid[i].length-1 || i==grid.length-1)) boundaryele=true;
        int left=(i>0 && grid[i-1][j]==1 )?dfs(grid,i-1,j):0;
        int right=(i<grid.length-1 && grid[i+1][j]==1)?dfs(grid,i+1,j):0;
        int top=(j>0 && grid[i][j-1]==1 )?dfs(grid,i,j-1):0;
        int bottom=(j<grid[i].length-1 && grid[i][j+1]==1)?dfs(grid,i,j+1):0;
        return 1+left+right+top+bottom;
    }
    public int numEnclaves(int[][] grid) {
    int totalcount=0;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]==1){
                int count=dfs(grid,i,j);
                if(!boundaryele) totalcount+=count;
            }
            boundaryele=false;
            }
    }
    return totalcount;    
    }
}
// BFS
// class Solution{
//     public in numEnclaves(int [][] grid){
//         boolean [][] visited=new boolean[grid.length][grid[0].length];
//         int count=0;
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[i].length;j++){
//                 if(grid[i][j]==1){
//                     if(i==0 || j==0 || i==grid.length-1 || j==grid[i].length-1){
//                       que.add()
//                     }
//                 }
//             }
//         }
//     }
// }