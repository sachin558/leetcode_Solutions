class Solution {
    public int numJewelsInStones(String J, String S) {
       int res=0;
        for(char s:J.toCharArray()){
            for(char j:S.toCharArray()){
                if(s==j){
                    res++;
                }
            }
        }
        return res;
    }
}