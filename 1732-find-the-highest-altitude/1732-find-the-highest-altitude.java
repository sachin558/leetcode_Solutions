class Solution {
    public int largestAltitude(int[] gain) {
        int a=0,maxh=0;
        for(int i=0;i<gain.length;i++){
            a+=gain[i];
            maxh=Math.max(maxh,a);
        }
        return maxh;
    }
}