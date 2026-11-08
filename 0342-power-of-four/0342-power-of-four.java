class Solution {
    public boolean isPowerOfFour(int n) {
    if(n==0) return false;
    double a=Math.sqrt(n);
    int b=(int)a;
    if(b!=a) return false;
    if( (b & (b-1))==0){
       return true;
    }    
    return false;
    }
}