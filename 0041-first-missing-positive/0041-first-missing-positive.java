class Solution {
    public int firstMissingPositive(int[] nums) {
    int i=0;
    int pos=0;
    while(i<nums.length){
        if(nums[i]==i+1 || nums[i]>=nums.length || nums[i]<=0  ){
            i++;
        }
        else if(nums[i]-1!=i){
            int index=nums[i]-1;
            int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
            if(nums[index]==nums[i]) i++;
        }
    }
    for(int j=0;j<nums.length;j++){
        if(nums[j]-1!=j){
            pos=j+1;
            return pos;
        }
    }
     return nums.length+1;    
    }
}