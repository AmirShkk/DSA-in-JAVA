class Solution {
    public int countHomogenous(String s) {
    long count=0;
    long MOD=1000000007;
    int i=0;
    int j=1;    
    while(j<s.length()){
      if(s.charAt(i)!=s.charAt(j)){
       long substring=j-i;
       count=(count+(substring*(substring+1))/2)%MOD;
       i=j;
       j=(i+1);
       }
       else{
        j++;
       }
}
    long substring=j-i;
    count=(count+(substring*(substring+1))/2)%MOD;
    return (int)count;    
    }
}