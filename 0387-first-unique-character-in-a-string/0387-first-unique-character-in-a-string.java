class Solution {
    public int firstUniqChar(String s) {
        int []arr=new int[26];
        int i=0;
        while(i<s.length()){
             arr[((int)s.charAt(i))-97]++;
             i++;
        }
        int j=0;
        while(j<s.length()){
            if(arr[((int)s.charAt(j))-97]==1){
               return j;
            }
            j++;
        }
        return -1;
    }
}