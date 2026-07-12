class Solution {
    static int count;
    public int reversePairs(int[] nums) {
       count=0;
       mergesort(nums);
       return count; 
    }
    public void mergesort(int nums[]){
        int n=nums.length;
        if(n==1) return;
        int []a=new int[n/2];
        int []b=new int[n-n/2];
        for(int i=0;i<a.length;i++){
            a[i]=nums[i];
        }
        for(int i=0;i<b.length;i++){
            b[i]=nums[a.length+i];
    }
        mergesort(a);
        mergesort(b);
        inversion(a,b);
        merge(a,b,nums);
    }
    public void merge(int a[],int b[],int nums[]){
        int i=0;int j=0;int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) nums[k++]=a[i++];
           else nums[k++]=b[j++];
           }
        while(i<a.length) nums[k++]=a[i++];
        while(j<b.length) nums[k++] =b[j++]; 
    }
    public void inversion(int a[],int b[]){
        int i=0;int j=0;
        while(i<a.length && j<b.length){
            long temp=b[j];
            if(a[i]>2*temp){
                count+=a.length-i;
                j++;
            }
            else{
                i++;
            }
        }
    }
}