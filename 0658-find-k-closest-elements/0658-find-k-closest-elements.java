// class twin implements Comparable<twin>{
//     int val;
//     int insertel;
//     twin(int val,int insertel){
//         this.val=val;
//         this.insertel=insertel;
//     }
//     public int compareTo(twin t){
//         int compare=Integer.compare(this.insertel,t.insertel);
//         if(compare==0){
//           compare=Integer.compare(this.val,t.val);
//         }
//         return compare;
//     }
// }
// class Solution {
//     public List<Integer> findClosestElements(int[] arr, int k, int x) {
//     PriorityQueue<twin> pq=new PriorityQueue<>(Collections.reverseOrder());
//     for(int el:arr){
//         if(el>x) pq.add(new twin(el,el-x));
//         else pq.add(new twin(el,x-el));
//         if(pq.size()>k) pq.remove();
//     }
//     PriorityQueue<Integer> pq2=new PriorityQueue<>();
//     while(pq.size()>0) {
//         twin t=pq.remove();
//         pq2.add(t.val);
//     }
//     List<Integer> ans=new ArrayList<>();
//     while(pq2.size()>0){
//         ans.add(pq2.remove());
//     }
//     return ans;
//     }
// }
class Solution{
    public List<Integer> findClosestElements(int [] arr,int k,int x){
    int low=0;
    int high=arr.length-1;
    List<Integer> ans=new ArrayList<>();
    while(low<high){
        int  mid=(high-low)/2+low;
        if(arr[mid]>=x) high=mid;
        else low=mid+1; 
    }
    int i=0;
    int l=high-1;int r=high;
    while( i<k ){
      if(l==-1) r=r+1;
      else if(r==arr.length) l=l-1;
      else if(Math.abs(arr[l]-x)<=Math.abs(arr[r]-x)) l=l-1;
      else  r=r+1;
      i++;
    }
    for(int j=l+1;j<r;j++){
        ans.add(arr[j]);
    }
    return ans;
    }
}