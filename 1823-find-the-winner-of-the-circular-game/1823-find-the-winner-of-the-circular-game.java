class Solution {
    public int findTheWinner(int n, int k) {
    Queue<Integer> que=new LinkedList<>();
    for(int i=1;i<=n;i++){
        que.add(i);
    }  
    int temp=k-1;
    while(que.size()!=1){
       if(temp==0){
           que.remove();
           temp=k-1;
       }
       else{
          que.add(que.remove());
          temp--;
       }
    }
    return que.peek();
    }
}