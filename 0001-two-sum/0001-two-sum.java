class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashSet<Integer> set=new HashSet<>();
    int secondel=-1;
    int i;
    for(i=0;i<nums.length;i++){
        secondel=target-nums[i];
        if(set.contains(secondel)){
            break;
        }
        set.add(nums[i]);
    }
    int[] ans=new int[2];
    ans[0]=i;
    for(i=0;i<nums.length;i++){
        if(nums[i]==secondel){
            ans[1]=i;
            break;
        }
    }
    return ans;
    }
}