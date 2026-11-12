class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
    Stack<Integer> st=new Stack<>();
    st.push(nums[0]);
    int i=1;
    int n=nums.length;
    while(i<n){
       while(!st.isEmpty() && nums[i]<st.peek() && (((n-1)-i)+st.size()>=k)) st.pop();
       st.push(nums[i]);
       if(st.size()>k) st.pop();
       i++;
    }
    if(st.size()>k) {
        st.pop();
       }   
    int [] ans=new int[st.size()];
    for(i=ans.length-1;i>=0;i--){
        ans[i]=st.pop();
    }
    return ans;
    }
}