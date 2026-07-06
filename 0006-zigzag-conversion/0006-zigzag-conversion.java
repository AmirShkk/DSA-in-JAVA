class Solution {
    public String convert(String s, int numRows) {
    StringBuilder ans=new StringBuilder();
    if(numRows==1) return s;
    for(int i=0;i<numRows;i++){
        int index=i;
        int goingsouth=2*((numRows-1)-i);
        int goingnorth=2*i;
        boolean flag=true;
        while(index<s.length()){
        ans.append(s.charAt(index));
        if(i==0) index+=goingsouth;
        else if(i==(numRows-1)) index+=goingnorth;
        else{
            if(flag) index+=goingsouth;
            else index+=goingnorth;
        }
        flag=!flag;
        }
    }   
    return ans.toString();
    }
}