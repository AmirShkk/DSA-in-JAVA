class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
    int []arr=new int[2];;
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    boolean []arr1=new boolean[101];
    boolean []arr2=new boolean[101];
    for(int el:nums1){
        arr1[el]=true;
    }
    for(int el:nums2){
        arr2[el]=true;
    }
    for(int el:nums1){
        if(arr2[el]) arr[0]++;
    }
    for(int el:nums2){
        if(arr1[el]) arr[1]++;
    }
    return arr;
    }
}