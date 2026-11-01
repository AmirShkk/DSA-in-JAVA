class Solution {
    public int gcd(int a ,int b){
        while(a!=0){
            int t=b%a;
            b=a;
            a=t;
        }
        return b;
    }
    public long countPairs(int[] nums, int k) {
    HashMap<Integer,Integer> hm=new HashMap<>();
    long count=0;
    for(int i:nums){
        int num=gcd(Math.min(k,i),Math.max(k,i));
        hm.put(num,hm.getOrDefault(num,0)+1);
    }
    for(int el:hm.keySet()){
          long n=hm.get(el);
        if((long)el*el%k==0 && hm.get(el)>1){
          
            count+=n*(n-1);
        }
        for(int b:hm.keySet()){
        if((long)el*b%k==0 && b!=el){
            count+=n*hm.get(b);
        }
    }
    }
    return count/2;
    }
}