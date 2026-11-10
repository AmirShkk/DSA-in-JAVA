class Solution {
    public int[] singleNumber(int[] nums) {
    int num=0;
    for(int el:nums){
       num^=el;
    }    
    int copyofnum=num;
    int mask=copyofnum^((num)&(num-1));
    int b1=0;int b2=0;
    for(int el:nums){
        int n=el&mask;
        if(n==0) b1^=el;
        else b2^=el;
    }
    int [] arr=new int[2];
    arr[0]=b1;
    arr[1]=b2;
     return arr;
    }
}