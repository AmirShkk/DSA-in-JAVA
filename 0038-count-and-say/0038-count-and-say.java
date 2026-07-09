class Solution {
    public String countAndSay(int n) {
       if(n==1){
        return "1";
       } 
       String s1=countAndSay(n-1);
       StringBuilder result=new StringBuilder();
       int i=0;
       while(i<s1.length()){
          char ch=s1.charAt(i);
          int freq=0;
          while(i<s1.length() && s1.charAt(i)==ch ){
            i++;
            freq++;
          }
         result.append(freq);
          result.append(ch);
       }
       return result.toString();

    }
}