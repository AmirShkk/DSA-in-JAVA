class Solution {
    public void recursion(int []nums,List<List<Integer>> arr,List<Integer> innerarr,HashSet<Integer> hs){
        if(nums.length==innerarr.size()){
            ArrayList<Integer> copy=new ArrayList<>(List.copyOf(innerarr));
            arr.add(copy);
        }
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                innerarr.add(nums[i]);
                recursion(nums,arr,innerarr,hs);
                hs.remove(nums[i]);
                innerarr.remove(innerarr.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> arr=new ArrayList<>();
    HashSet<Integer> hs=new HashSet<>();
    recursion(nums,arr,new ArrayList<Integer>(),hs);
    return arr;
    }
}