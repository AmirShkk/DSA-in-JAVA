class Solution {
    public int findMin(int[] arr) {
      int min=Integer.MAX_VALUE;
      int low=0;
      int high=arr.length-1;
      while(low<=high){
        if(arr[low]<=arr[high]){
          min=Math.min(arr[low],min);
          return min;
        } 
        int mid=low+(high-low)/2;
        if(arr[mid]<arr[low]) high=mid-1;
        else low=mid+1;
        min=Math.min(min,arr[mid]);
      }
    return min;
    }
}
