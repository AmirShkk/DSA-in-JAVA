class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start=0;
        int mid=0;
        int end=arr.length-1; 
        while(start<=end){
             mid=start+((end-start)/2);
            if(arr[mid]==mid+1){
                start=mid+1;
            }
            else{
                if((arr[mid]-(mid+1))>=k){
                    end=mid-1;
                }
                else{

                    start=mid+1;
                }
                
            }
        }
        return start+k;
    }
}