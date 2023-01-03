public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(nums,0,new ArrayList<Integer>(),ans);
        return ans;
        }
    public void backtrack(int []nums,int strat_ind,List<Integer> trac,List<List<Integer>> ans ){
        ans.add(new ArrayList<>(trac));
        for(int i=strat_ind;i<nums.length;i++){
            trac.add(nums[i]);
            backtrack(nums,i+1,trac,ans);
            trac.remove(trac.size()-1);
        }
    }
    }
