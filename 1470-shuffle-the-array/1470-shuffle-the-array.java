class Solution {
    public int[] shuffle(int[] nums, int n) {
        int left=0;
        int num[]=new int[2*n];
        for(int i=0;i<n;i++){
            num[left]=nums[i];
            num[left+1]=nums[i+n];
            left+=2;
        }
        return num;
    }
}