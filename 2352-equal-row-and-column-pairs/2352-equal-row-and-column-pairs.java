class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                int flag=0;
                for(int k=0;k<grid.length;k++){
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