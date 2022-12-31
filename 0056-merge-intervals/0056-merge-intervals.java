class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list=new ArrayList();
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals,(i1,i2)->i1[0]-i2[0]);
        int []newarr=intervals[0];
        int i=1;
        while(i<intervals.length){
            if(newarr[1]<intervals[i][0]){
                list.add(newarr);
                newarr=intervals[i];
            }
            else newarr[1]=Math.max(newarr[1],intervals[i][1]);
            i++;
        }
        list.add(newarr);
        return list.toArray(new int[list.size()][]);
    }
}