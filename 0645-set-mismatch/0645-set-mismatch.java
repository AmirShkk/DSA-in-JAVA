class Solution {
    public int[] findErrorNums(int[] nums) {
    int []ans=new int[2];
    int i=0;
    while(i<nums.length){
        if(nums[i]-1!=i){
            int index=nums[i]-1;
            int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
            if(nums[i]==nums[index]){
                i++;
            }
        }
        else{
            i++;
        }
    }
    for(int j=0;j<nums.length;j++){
        if(nums[j]-1!=j){
            ans[0]=nums[j];;
             ans[1]=(j+1);
        }
    }
     return ans;
    }
}