class Solution {
    public String reverseWords(String s) {
    StringBuilder str=new StringBuilder();
    int i=s.length()-1;
    int j=s.length()-1;
    while(j>=0){
        if(s.charAt(j)==' '){
            if(i!=j){
              if(str.length()>0) str.append(" ");
              StringBuilder word=new StringBuilder(s.substring(j+1,i+1));
              str.append(word);
              }
              j--;
              i=j;
        }
        else{
            j--;
        }
    }  
        if(i!=j){
              if(str.length()>0) str.append(" ");
              StringBuilder word=new StringBuilder(s.substring(j+1,i+1));
              str.append(word);
        }
        return str.toString();
    }
}