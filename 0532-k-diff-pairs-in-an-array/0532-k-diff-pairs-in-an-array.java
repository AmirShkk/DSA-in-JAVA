class Solution {
    public int findPairs(int[] nums, int k) {
    int count=0;
    Arrays.sort(nums);
    int i=0;int j=1;
    while(i<nums.length && j<nums.length){
        if(Math.abs(nums[i]-nums[j])>k) i++;
        else if(Math.abs(nums[i]-nums[j])==k && i!=j){
            System.out.println(i);
            System.out.println(j);
            count++;
            int val=nums[i];
            while(i<nums.length && val==nums[i]) i++;
            j=i+1;
        }
        else{
            j++;
        }
    }
    return count;    
    }
}