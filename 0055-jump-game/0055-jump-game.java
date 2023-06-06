class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        if(nums.length==1) return true;
        for(int i=0;i<nums.length-1 && max>=i;i++){
            if(max<i+nums[i]){
                max=nums[i]+i;
            }
            if(max >=nums.length-1){
                return true;
            }
        }
        return false;
    }
}