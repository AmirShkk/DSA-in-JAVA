class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashMap<Character,Integer> hm=new HashMap<>();
    int length=Integer.MIN_VALUE;
    int j=0;
    int i;
    for(i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(hm.containsKey(ch) && hm.get(ch)>=j){
            int val=(i-j);
            length=Math.max(length,val);
            j=hm.get(ch);
            j++;
            hm.put(ch,i);
            
        }
        else{
            hm.put(ch,i);
        }
    }
    int val=i-j;
    length=Math.max(length,val);
    return length;    
    }
}