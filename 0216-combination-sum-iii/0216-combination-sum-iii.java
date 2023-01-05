class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        LinkedList<Integer> comb=new LinkedList<>();
        back(n,k,comb,0,result);
        return result;
    }
    public void back(int remain,int k,LinkedList<Integer> comb,int start_index,List<List<Integer>> result){
        if(remain==0 && comb.size()==k){
            result.add(new ArrayList<Integer>(comb));
            return ;
        }
        if(remain<0 || comb.size()==k)
            return ;
        for(int i=start_index;i<9;++i){
            comb.add(i+1);
            this.back(remain-i-1,k,comb,i+1,result);
            comb.removeLast();
        }
    }
}