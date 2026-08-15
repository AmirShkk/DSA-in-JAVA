class Solution {
    public int[] nextGreaterElements(int[] nums) {
    Stack<Integer>st=new Stack<>();
    int [] arr=new int[nums.length];
    for(int i=nums.length-1;i>=0;i--){
        st.push(nums[i]);
    }
    for(int j=arr.length-1,i=nums.length-1;i>=0;i--){
        while(st.size()!=0 && nums[i]>=st.peek()) st.pop();
        if(st.size()==0) arr[j--]=-1;
        else arr[j--]=st.peek();
        st.push(nums[i]);
        }
    return arr;

    }
}