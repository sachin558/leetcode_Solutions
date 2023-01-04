class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
              List<List<Integer>> result=new ArrayList<List<Integer>>();
        LinkedList<Integer> comb=new LinkedList<>();
        Arrays.sort(candidates);
        back(target,comb,0,candidates,result);
        return result;
    }
    public void back(int remain,LinkedList<Integer> comb,int start,int []candidates,List<List<Integer>> result){
        if(remain==0) {
                result.add(new ArrayList<Integer>(comb)); return ;
        }
        
        for(int i=start;i<candidates.length;i++){
           if(start!=i && candidates[i]==candidates[i-1])
               continue;
            if(candidates[i]<=remain){
                comb.add(candidates[i]);
                back(remain-candidates[i],comb,i+1,candidates,result);
                comb.removeLast();
            }
        }
    }
}