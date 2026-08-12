class Solution {
    public String removeDuplicates(String s) {
    String ans="";
    Stack<Character> st=new Stack<>();
    Stack<Character> st2=new Stack<>();
    for(int i=0;i<s.length();i++){
        if( st.size()==0 || s.charAt(i)!=st.peek() ){
            st.push(s.charAt(i));
        }
        else{
            st.pop();
        }
    }
    while(st.size()!=0) st2.push(st.pop());
    while(st2.size()!=0) ans+=st2.pop(); 
    return ans;   
    }
}