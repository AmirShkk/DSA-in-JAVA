class Solution {
    public void dfs(int roomno,List<List<Integer>> rooms,int [] unlockrooms){
    unlockrooms[roomno]=1;
    for(int i=0;i<rooms.get(roomno).size();i++){
        int insideroomno=rooms.get(roomno).get(i);
        if(unlockrooms[insideroomno]!=1){
            dfs(insideroomno,rooms,unlockrooms);
        }
    }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    int [] unlockrooms=new int[rooms.size()];
    dfs(0,rooms,unlockrooms);
    for(int i=0;i<unlockrooms.length;i++){
        if(unlockrooms[i]==0) return false;
    }
    return true; 
    }
}