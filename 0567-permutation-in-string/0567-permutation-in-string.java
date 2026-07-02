class Solution {
    public boolean checkInclusion(String s1, String s2) {
    int i=0;
    int []freq=new int[26];
    int []windowfreq=new int[26];
    while(i<s1.length()){
      freq[(int)(s1.charAt(i)-97)]++;
      i++;
    } 
    int j=0;
    while(j<s2.length()){
     windowfreq[(int)(s2.charAt(j)-97)]++;
     if(j>=s1.length()){
        windowfreq[(int)(s2.charAt(j-s1.length())-'a')]--;
     }
     if(Arrays.equals(windowfreq,freq)){
        return true; 
     }
    j++;
     }
      return false;   
    
    }
}