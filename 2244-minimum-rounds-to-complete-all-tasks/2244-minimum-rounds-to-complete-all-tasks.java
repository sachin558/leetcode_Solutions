class Solution {
    public int minimumRounds(int[] tasks) {
       Map<Integer,Integer> ans=new HashMap<>();
        for(int task:tasks )
            ans.put(task,ans.getOrDefault(task,0)+1);
        int res=0;
        for(int count:ans.values()){
            if(count==1) return -1;
            res+=(count+2)/3;
        }
        return res;
    }
}