class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> set=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int intial=nums[i];
            while(i+1 < nums.length && nums[i]+1 == nums[i+1]){
                i++;
            }
            if(intial!=nums[i]){
                set.add(""+intial+"->"+nums[i]);
            }
            else{
                set.add(""+intial);
            }
        }
        return set;
    }
}