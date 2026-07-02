class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int copyk=k;
        int copym=m;
        int index=-1;
        for(int el:bloomDay){
            max=Math.max(max,el);
        }
        for(int el:bloomDay){
            min=Math.min(min,el);
        }
        int low=min;
        int high=max;
        while(low<=high){
            int mid=low+((high-low)/2);
            int i=0;
            while(i<bloomDay.length){
                if(bloomDay[i]<=mid){
                    k--;
                    if(k==0){
                       m--;
                       k=copyk;
                }
                }
                else k=copyk;
                i++;
                if(m==0) break;
                }
                if(m==0){
                    index=mid;
                    high=mid-1;
                }
                else low=mid+1;
                m=copym;
                k=copyk;
            }
        return index;
    }
}