class Solution {
    public int minimumindex(int []arr,int val,int start){
        int minidx=-1;int minvalue=Integer.MAX_VALUE;
        for(int i=start;i<arr.length;i++){
            if(arr[i]>val && arr[i]<=minvalue){
                minidx=i;
                minvalue=arr[i];
            }
        }
        return minidx;
    }
    public void reverse(int [] arr,int start){
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] arr) {
       boolean found=false;
       for(int i=arr.length-1;i>=1;i--){
          if(arr[i]>arr[i-1]){
             found=true;
             int minidx=minimumindex(arr,arr[i-1],i);
             int temp=arr[i-1];
             arr[i-1]=arr[minidx];
             arr[minidx]=temp;
             reverse(arr,i);
             break;
       }
       }
       if(!found){
        reverse(arr,0);
       }
    }
}