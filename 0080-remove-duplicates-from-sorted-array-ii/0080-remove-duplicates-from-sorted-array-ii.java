class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
       int innerCount=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                innerCount++;
                if(innerCount>2)
                    continue;
            }
            else{
                innerCount=1;
            }
                nums[count++]=nums[i];
        }
        return count;
    }
}