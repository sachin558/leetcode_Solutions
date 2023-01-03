class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        back(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    public void back(int []nums,int start,List<Integer> trac,List<List<Integer>> ans){
        ans.add(new ArrayList<>(trac));
        for(int i=start;i<nums.length;i++){
            if(i!=start && nums[i] == nums[i-1])
                continue;
             trac.add(nums[i]);
             back(nums,i+1,trac,ans);
             trac.remove(trac.size()-1);
        }
    }
}