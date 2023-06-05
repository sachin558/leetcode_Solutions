class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int l1=nums1.length, l2=nums2.length;
        int arr[]=new int[l1+l2];
        for(int i=0;i<l1;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<l2;i++){
            arr[l1+i]=nums2[i];
        }
        Arrays.sort(arr);
         double result=0;
        if(arr.length%2!=0){
            result = arr[arr.length /2];
        }else{
            double k = arr[arr.length/2-1]+arr[arr.length/2];
            result =k/2;
        }
        return result;
    }
}