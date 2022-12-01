class Solution {
    public int[] twoSum(int[] nums, int target) {
      int arr[]=new int[2];
        int first=0, second=nums.length-1,sum=0;
        while(first<=second){
            sum=nums[first]+nums[second];
            if(sum==target){
                arr[0]=first+1;
                arr[1]=second+1;
                return arr;
            }if(sum>target){
                second--;
            }else
                first++;
        }
        return arr;
    }
}