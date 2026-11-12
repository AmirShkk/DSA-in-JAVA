class Solution {
    public String removeKdigits(String num, int k) {
    Stack<Character> st=new Stack<>();
    st.push(num.charAt(0));
    int i=1;
    while(k!=0 && i<num.length()){
            while( !st.isEmpty() && num.charAt(i)<st.peek() && k!=0) {
                st.pop();
                k--;
            }
        st.push(num.charAt(i));
        i++;
    }
    while(k>0){
         st.pop();
         k--;
        } 
    while(i<num.length()) {
            st.push(num.charAt(i));
            i++;
    }
    StringBuilder sb=new StringBuilder();
    while(!st.isEmpty()){
        sb.insert(0,st.pop());
    }
    while( sb.length()>0 && sb.charAt(0)=='0'){
            sb.delete(0,1);
        }
    if(sb.length()==0) return "0";
    return sb.toString();
    }
}