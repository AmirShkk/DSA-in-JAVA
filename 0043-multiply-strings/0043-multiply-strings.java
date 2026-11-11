class Solution {
    public String multiply(String num1, String num2) {
    int [] arr=new int[num1.length()+num2.length()];
    if(num1.length()<num2.length()){
        String temp=num1;
        num1=num2;
        num2=temp;
    }
    
    for(int i=num2.length()-1,count=0;i>=0;i--,count++){
        int m=(arr.length-1)-count;
        for(int j=num1.length()-1;j>=0;j--){
            arr[m]=arr[m]+(num2.charAt(i)-48)*(num1.charAt(j)-48);
            arr[m-1]+=arr[m]/10;
            arr[m]=arr[m]%10;
            m--;
        }
    }
    String ans="";
    int nonzeroidx=0;
    while(nonzeroidx<arr.length && arr[nonzeroidx]==0){
        nonzeroidx++;
    }
    for(int i=nonzeroidx;i<arr.length;i++){
        ans+=arr[i];
    }
    if(ans=="") return ans+=0;
    return ans;
    }
}