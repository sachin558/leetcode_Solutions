class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> freq=new HashMap<>();
      for(Integer task:tasks){
          freq.put(task,freq.getOrDefault(task,0)+1);
      }
      int res=0;
      for(Integer count:freq.values()){
          if(count==1) return -1;
          res+=(count+2)/3;
      }
        return res;
    }
}