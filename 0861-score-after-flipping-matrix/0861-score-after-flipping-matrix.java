class Solution {
    public void fliprow(int [][]arr,int row){
        for(int i=0;i<arr[row].length;i++){
            if(arr[row][i]==0) arr[row][i]=1;
            else arr[row][i]=0;
        }
    }
    public void flipcol(int [][]arr,int col){
        for(int i=0;i<arr.length;i++){
            if(arr[i][col]==1) arr[i][col]=0;
            else arr[i][col]=1;
        }
    }
    public int maxnum(int [][] arr,int col){
        int count0=0;int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][col]==1) count1++;
            else count0++;
        }
        if(count0>count1) return 0;
        else return 1;
    }
    public int matrixScore(int[][] grid) {
    for(int i=0;i<grid.length;i++){
        if(grid[i][0]==0){
            fliprow(grid,i);
        }
    }
    for(int i=0;i<grid[0].length;i++){
        System.out.println(maxnum(grid,i));
        if(maxnum(grid,i)==0){
            flipcol(grid,i);
        }
    }
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            System.out.print(grid[i][j]);
        }
        System.out.println();
    }
    int num=0;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
           if(grid[i][j]==1){
            int power=(grid[i].length-1)-j;
            num+=(1<<power);
           }
        }
    }    
    return num;
    }
}