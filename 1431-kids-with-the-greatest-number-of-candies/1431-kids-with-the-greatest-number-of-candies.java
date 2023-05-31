class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> list = new ArrayList<>();
        int maxcandie=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>maxcandie)
                maxcandie=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >=maxcandie)
                list.add(true);
            else 
                list.add(false);
        }
        return list;
    }
}