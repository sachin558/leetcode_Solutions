class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                nums[count++]=nums[i];
        }
        int i=count;
        while(i<nums.length)
            nums[i++]=0;
        }
        }