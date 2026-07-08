class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
    int []arr=new int[2];;
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int i=0;
    int j=0;
    while(i<nums1.length && j<nums2.length){
        if(nums1[i]==nums2[j]){
            arr[0]++;
            arr[1]++;
            i++;
            j++;
        }
        else if(nums1[i]<nums2[j]){
            if( j>0 && nums1[i]==nums2[j-1]){
                arr[0]++;
            }
            i++;
        }
        else {
            if(i>0 && nums1[i-1]==nums2[j] ){
                arr[1]++;
            }
            j++;
        }    
        }
        while(i<nums1.length){
            if(nums1[i]==nums2[j-1]){
                arr[0]++;
                }
            i++;    
        }
         while(j<nums2.length){
            if(nums2[j]==nums1[i-1]){
                arr[1]++;
            }
            j++;
        }
    return arr;
    }
}

