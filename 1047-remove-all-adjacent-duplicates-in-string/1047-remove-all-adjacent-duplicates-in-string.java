class Solution {
    public String removeDuplicates(String s) {
    StringBuilder stack=new StringBuilder();
    for(int i=0;i<s.length();i++){
        if(stack.length()==0 || s.charAt(i)!=stack.charAt(stack.length()-1)){
            stack.append(s.charAt(i));
        }
        else{
            stack.deleteCharAt(stack.length()-1);
        }
    }
    return stack.toString();   
    }
}