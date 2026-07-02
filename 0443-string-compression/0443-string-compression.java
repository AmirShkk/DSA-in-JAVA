class Solution {
    public int compress(char[] chars) {
    int i=0;
    int j=0;
    int k=0;
    int count=0;
    while(j<chars.length){
        if(chars[i]==chars[j]){
            j++;
            count++;
        }
        else{
            chars[k]=chars[i];
            k++;
            if(count>1){
              String s=String.valueOf(count);
              for(char el:s.toCharArray()){
                chars[k++]=el;
              }
            }
            count=0;
            i=j;
}
    }
    chars[k]=chars[j-1];
    k++;
    if(count>1) {
        String s=String.valueOf(count);
        for(char el:s.toCharArray()){
            chars[k++]=el;
              }
    }
    return k;
        }
}