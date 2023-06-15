class Solution {
    public int trap(int[] height) {
        int len=height.length,res=0;
        int first[]=new int[len];
        int second[]=new int[len];
        
        first[0]=height[0];
        for(int i=1;i<len;i++){
            first[i]=Math.max(height[i],first[i-1]);
        }
        second[len-1]=height[len-1];
        for(int j=len-2;j>=0;j--){
            second[j]=Math.max(height[j],second[j+1]);
        }
        for(int i=1;i<len;i++){
            res+=(Math.min(first[i],second[i])-height[i]);
        }
        return res;
    }
}