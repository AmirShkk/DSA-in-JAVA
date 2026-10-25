class Solution {
    public static boolean isAnagram(String s1, String s2) {
       
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(map.containsKey(ch)){
                int val=map.get(ch);
                map.put(ch,++val);
            }
            else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(!map.containsKey(ch)) return false;
            else{
                int val=map.get(ch);
                map.put(ch,--val);
            }
    }
        for(char ch:map.keySet()){
            if(map.get(ch)!=0) return false;
        }
        return true;

    }
}