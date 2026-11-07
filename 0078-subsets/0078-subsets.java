class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    int n=1<<nums.length;
    List<List<Integer>> arr=new ArrayList<>();
    for(int i=0;i<n;i++){
        List<Integer> innerarr=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
           if((i>>j)%2==1){
            innerarr.add(nums[j]);
           } 
        }
        arr.add(innerarr);   
        }
    return arr;    
    }
}