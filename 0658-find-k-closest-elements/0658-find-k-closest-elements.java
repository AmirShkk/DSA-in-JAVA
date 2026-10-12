class twin implements Comparable<twin>{
    int val;
    int insertel;
    twin(int val,int insertel){
        this.val=val;
        this.insertel=insertel;
    }
    public int compareTo(twin t){
        int compare=Integer.compare(this.insertel,t.insertel);
        if(compare==0){
          compare=Integer.compare(this.val,t.val);
        }
        return compare;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    PriorityQueue<twin> pq=new PriorityQueue<>(Collections.reverseOrder());
    for(int el:arr){
        if(el>x) pq.add(new twin(el,el-x));
        else pq.add(new twin(el,x-el));
        if(pq.size()>k) pq.remove();
    }
    PriorityQueue<Integer> pq2=new PriorityQueue<>();
    while(pq.size()>0) {
        twin t=pq.remove();
        pq2.add(t.val);
    }
    List<Integer> ans=new ArrayList<>();
    while(pq2.size()>0){
        ans.add(pq2.remove());
    }
    return ans;
    }
}