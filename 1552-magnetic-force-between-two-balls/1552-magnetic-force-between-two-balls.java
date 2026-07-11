class Solution {
    public int maxDistance(int[] arr, int k) {
        int count=0;
        int copyofk=k;
        Arrays.sort(arr);
        int low=1;
        int high=arr[arr.length-1]-arr[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            int i=1;
            int cowposition=arr[0];
            while(k>1 && i<arr.length){
                if(arr[i]-cowposition>=mid){
                    k--;
                     cowposition=arr[i];
                    }
                i++;  
                }
            if(k==1){
                count=mid;
                low=mid+1;
           }
           else high=mid-1;
           k=copyofk;
        }
        return count;
    }
}