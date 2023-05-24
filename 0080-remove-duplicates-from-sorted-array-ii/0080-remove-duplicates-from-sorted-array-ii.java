class Solution {
    public int removeDuplicates(int[] nums) {
        int ans =1, count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
                if(count>2)
                    continue;
            }
            else 
                count=1;
            nums[ans++]=nums[i];
        }
        return ans;
     }
}