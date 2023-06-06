class Solution {
    public int jump(int[] nums) {
       int jump=0 , currsum=0,des=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+i > currsum){
                currsum=nums[i]+i;
            }
            if(i == des){
                
                des=currsum;
                jump++;
            }
        }
        return jump;
    }
}