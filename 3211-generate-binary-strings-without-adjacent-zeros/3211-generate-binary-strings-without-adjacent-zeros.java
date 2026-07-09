class Solution {
    public List<String> validStrings(int n) {
    ArrayList<String> ans=new ArrayList<>();
    recursion(n,0,ans,"");  
    return ans;  
    }
    public void recursion(int n,int level,ArrayList ans,String ch){
        if(n==level){
            ans.add(ch);
            return;
        }
        if( ch.length()==0 || ch.charAt(ch.length()-1)!='0' ){
            recursion(n,level+1,ans,ch+'0');
        }
        recursion(n,level+1,ans,ch+'1');
    }
}