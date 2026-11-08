class Solution {
    public int reverseBits(int n) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<32;i++){
            if((n>>i)%2==0) arr.add(0);
            else arr.add(1);
        }
        int ans=0;
        for(int i=30;i>=0;i--){
            int idx=(arr.size()-1)-i;
             if(arr.get(idx)==1) {
                ans+=(1<<i);
             }
        }
    return ans;    
    }
}