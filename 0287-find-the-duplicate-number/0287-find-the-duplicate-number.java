class Solution {
    public int findDuplicate(int[] nums) {
        int[] flag=new int[nums.length+1];
        int duplicateElement=-1;
        for(int i=0;i<nums.length;i++){
            flag[nums[i]]++;
            if(flag[nums[i]]>1){
                duplicateElement=nums[i];
                break;
            }
        }
        return duplicateElement;
    }
}