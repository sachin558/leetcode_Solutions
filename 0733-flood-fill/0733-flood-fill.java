class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        Dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public void Dfs(int [][]image,int row,int col,int color,int precolor){
        if(row>=image.length ||row<0 || col>=image[0].length || col<0 || image[row][col]!=precolor ) return ;
        
        image[row][col]=color;
        
        Dfs(image,row-1,col,color,precolor);
        Dfs(image,row+1,col,color,precolor);
        Dfs(image,row,col-1,color,precolor);
        Dfs(image,row,col+1,color,precolor);
    }
}