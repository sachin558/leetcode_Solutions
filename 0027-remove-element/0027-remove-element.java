class Solution {
    public int removeElement(int[] nums, int val) {
        int inde_X=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]!=val){
                nums[inde_X]=nums[i];
                inde_X++;
            }
        }
        return inde_X;
    }
}