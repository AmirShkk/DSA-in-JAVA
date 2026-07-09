class Solution {
    public String countAndSay(int n) {
       if(n==1){
        return "1";
       } 
       String s1=countAndSay(n-1);
       String result="";
       int i=0;
       int count=1;
       while(i<s1.length()-1){
        if(s1.charAt(i)!=s1.charAt(i+1)){
            result+=Integer.toString(count)+Character.toString(s1.charAt(i));
            count=1;}
        else{
            count++;
        }
        i++;
       }
       result+=Integer.toString(count)+Character.toString(s1.charAt(i));
       return result;

    }
}