class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] ans=new int[nums.length];
        int prefixpro=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=prefixpro;
            prefixpro*=nums[i];
        }
        int suffixpro=1;
        for(int j=nums.length-1;j>=0;j--){
            ans[j]*=suffixpro;
            suffixpro*=nums[j];
        }
        return ans;
    }
}