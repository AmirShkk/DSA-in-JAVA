class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int i=0;i<stones.length;i++){
        pq.add(stones[i]);
       }
        while(pq.size()>1){
        int stone1=pq.remove();
        int stone2=pq.remove();
        if(stone2>stone1){
            int temp=stone1;
            stone1=stone2;
            stone2=temp;
        }
        stone1=stone1-stone2;
        pq.add(stone1);
       }
       return pq.peek();

    }
}