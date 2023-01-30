class Solution {
    public int jump(int[] nums) {
       int currentmax=0,reachsum=0,jump=0;
        for(int i=0;i<nums.length-1;i++){
            if(i+nums[i]>currentmax){
                currentmax=i+nums[i];
            }
            if(i==reachsum){
                jump++;
                reachsum=currentmax;
            }
        }
        return jump;
    }
}