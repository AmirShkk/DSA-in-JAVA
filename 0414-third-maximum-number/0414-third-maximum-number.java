class Solution {
    public int thirdMax(int[] arr) {
    long max=Long.MIN_VALUE;long secmax=Long.MIN_VALUE;
    long thirdmax=Long.MIN_VALUE;
    int i=0;
    while(i<arr.length){
        if(arr[i]>max){
            thirdmax=secmax;
            secmax=max;
            max=arr[i];
        }
        else if(arr[i]>secmax && arr[i]<max){
            thirdmax=secmax;
            secmax=arr[i];
        }
        else if(arr[i]>thirdmax && arr[i]<secmax){
            thirdmax=arr[i];
        }
        i++;
    }
    return thirdmax==Long.MIN_VALUE?(int)max:(int)thirdmax;
    }
}