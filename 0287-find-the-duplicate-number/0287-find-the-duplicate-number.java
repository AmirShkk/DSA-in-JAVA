class Solution {
    public int findDuplicate(int[] arr) {
       int i=0;
       int duplicate=-1;
       while(i<arr.length){
        if(arr[i]-1!=i){
            int index=arr[i]-1;
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
            if(arr[i]==arr[index]){
                duplicate=arr[index];
                break;
            }
        }
        else{
            i++;
        }
       }

       return duplicate;
    }
}