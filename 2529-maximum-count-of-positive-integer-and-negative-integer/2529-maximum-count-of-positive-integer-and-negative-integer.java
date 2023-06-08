class Solution {
    public int maximumCount(int[] nums) {
        int count=0,count1=0;
        for(int num:nums){
            if(num > 0) count++;
            if(num < 0) count1++;
        }
        return count > count1 ? count :count1;
    }
}