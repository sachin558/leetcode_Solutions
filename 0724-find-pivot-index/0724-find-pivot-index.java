class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==0) return -1;
        int leftsum=0,rightsum=0;
        for(int val:nums)
            rightsum+=val;
        for(int i=0;i<nums.length;i++){
            rightsum-=nums[i];
            if(rightsum==leftsum) return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}