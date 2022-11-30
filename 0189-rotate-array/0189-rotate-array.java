class Solution {
    public void rotate(int[] nums, int k) {
         int[] newarr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            newarr[(i+k)%nums.length]=nums[i];
        }
        for(int i=0; i<newarr.length; i++){
            nums[i]=newarr[i];
        }
    }
}