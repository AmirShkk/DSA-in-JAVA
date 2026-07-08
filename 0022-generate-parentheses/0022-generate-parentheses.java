class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        recursion(n,0,0,"",ans);
        return ans;
        }
        public void recursion(int n,int leftb,int rightb,String balancebracket,ArrayList ans) {
            if(leftb==n && rightb==n){
                ans.add(balancebracket);
                return;
            }
            if(leftb==rightb || rightb==n){
                recursion(n,leftb+1,rightb,balancebracket+"(",ans);
            }
            else if(leftb==n){
                 recursion(n,leftb,rightb+1,balancebracket+")",ans);
            }
            else{
                 recursion(n,leftb+1,rightb,balancebracket+"(",ans);
                 recursion(n,leftb,rightb+1,balancebracket+")",ans);
            }
    }   
}