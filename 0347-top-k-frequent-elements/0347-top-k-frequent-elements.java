class twin implements Comparable<twin> {
    int val;
    int freq;
    twin(int val,int freq){
        this.val=val;
        this.freq=freq;
    }
    public int compareTo(twin t){
        int compare=Integer.compare(this.freq,t.freq);
        if(compare==0){
            compare=Integer.compare(t.val,this.val);
        }
        return compare;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    int [] freq=new int[20001];
    for(int el:nums){
        freq[el+1000]++;
    }
    PriorityQueue<twin> pq=new PriorityQueue<>();
    for(int i=0;i<freq.length;i++){
        if(freq[i]==0) continue;
        else pq.add(new twin(i-1000,freq[i]));
        if(pq.size()>k) pq.remove();
    }
    int [] ans=new int[k];
    for(int i=0;i<k;i++){
        twin t=pq.remove();
        ans[i]=t.val;
    }
    return ans;
    }
}