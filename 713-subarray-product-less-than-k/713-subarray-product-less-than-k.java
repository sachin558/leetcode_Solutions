class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0,left=0,pro=1;
       if(k<=1) return 0;
        for(int r=0;r<nums.length;r++){
            pro*=nums[r];
            while(pro>=k){
                pro/=nums[left++];
            }
            count+=r-left+1;
        }
        return count;
    }
}