class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int flag=0;
                for(int k=0;k<n;k++){
                    if(grid[i][k]==grid[k][j])
                        continue;
                    else{
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                    count++;
            }
        }
        return count;
    }
}