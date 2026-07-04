class Solution {
    public String removeOccurrences(String s, String part) {
       StringBuilder s1=new StringBuilder(s);
       int i=0;
       while(i<s.length()){
        if((s1.length()+1-i)>=part.length()+1 && s1.substring(i,part.length()+i).equals(part)){
             s1.delete(i,part.length()+i); 
             i=0; 
        }
        else{
            i++;
        }
       }
       if(s1.length()==0) return "";
      
return s1.toString(); 
    }
}