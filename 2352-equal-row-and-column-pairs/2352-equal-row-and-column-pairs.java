class Solution {
    public int equalPairs(int[][] grid) {

        int n=grid.length;
        HashMap<String, Integer> hashMap=new HashMap<String,Integer>();
        for(int []row:grid){
            String rowstr = Arrays.toString(row);
            hashMap.put(rowstr,hashMap.getOrDefault(rowstr,0)+1);
        }
        int count=0;
        for(int j=0;j<grid.length;j++){
            int col[]=new int[n];
            for(int i=0;i<n;i++){
                col[i] = grid[i][j];
            }
            count+=hashMap.getOrDefault(Arrays.toString(col),0);
        }
        return count;
    }
}