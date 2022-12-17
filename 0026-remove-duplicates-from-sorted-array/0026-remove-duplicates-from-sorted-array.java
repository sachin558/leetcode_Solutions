class Solution {
    public int removeDuplicates(int[] nums) {
        int ind_x=1;
        int size=nums.length;
        for(int i=1;i<size;i++){
            if(nums[i]!=nums[ind_x-1]){
                nums[ind_x]=nums[i];
                ind_x++;
            }
        }
        return ind_x;
    }
}