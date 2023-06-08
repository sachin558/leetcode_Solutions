class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
       int i=grid[0].length-1;
        for(var  row:grid){
            while(i>=0 && row[i] <0)
                i--;
            count+=grid[0].length-i-1;
        }
        return count;
    }
}