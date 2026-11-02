// class Solution {
//     public int singleNonDuplicate(int[] arr) {
//         if(arr.length==1) return arr[0];
//         if(arr[0]!=arr[1]) return arr[0];
//         if(arr[arr.length-1]!=arr[arr.length-2]) return arr[arr.length-1];
//         int strt=0;
//         int mid=0;
//         int end=arr.length-1;
//         while(strt<=end){
//             mid=(strt+end)/2;
//             if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1] ) return arr[mid];
//             else if(arr[mid]==arr[mid-1]){
//                 if(mid%2!=0){
//                     strt=mid+1;
//                 }
//                 else{
//                     end=mid-1;
//                 }
//             }
//             else{
//                 if(mid%2!=0){
//                     end=mid-1;
//                 }
//                 else{
//                     strt=mid+1;
//                 }

//             }    
//             }
//             return 0;
//         }   
//     }
class Solution{
    public int singleNonDuplicate(int [] arr){
        int xor=0;
        for(int el:arr){
            xor^=el;
        }
    return xor;
    }
}