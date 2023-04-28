class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> obj=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!obj.add(nums[i]))
                return nums[i];
        }
        return nums.length;
    }
}