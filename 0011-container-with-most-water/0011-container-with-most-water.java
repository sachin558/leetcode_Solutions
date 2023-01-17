class Solution {
    public int maxArea(int[] height) {
      int len=height.length;
        int l=0;
        int r=len-1;
        int max=0;
        int curr=0;
        while(l<=r)
        {
            curr=Math.min(height[l], height[r])*(r-l);
            max=Math.max(max,curr);
            if(height[l] < height[r])
            {
                l++;
            }
            else r--;
        }
        return max;   
    }
}