class Solution {
    public int[] nextGreaterElements(int[] nums) {
    Stack<Integer> st=new Stack<>();
    int []nums1=new int[nums.length];
    int n=nums.length-1;
    for(int i=n;i>=0;i--){
        st.push(nums[i]);
    }
    for(int i=n;i>=0;i--){
      if(nums[i]>=st.peek()){
       while(st.size()!=0 && nums[i]>=st.peek()) st.pop();
      }
      if(st.size()==0){
        nums1[i]=-1;
      }
      else{
       nums1[i]=st.peek();
      }
      st.push(nums[i]);
    }
    return nums1;
    }
}