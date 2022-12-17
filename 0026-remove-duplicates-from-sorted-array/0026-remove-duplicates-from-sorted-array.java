class Solution {
    public int removeDuplicates(int[] nums) {
       int ind_x=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[ind_x-1]){
                nums[ind_x]=nums[i];
                ind_x++;
            }
        }
        return ind_x;
    }
}