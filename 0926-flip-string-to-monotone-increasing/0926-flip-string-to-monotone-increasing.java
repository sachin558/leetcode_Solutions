class Solution {
    public int minFlipsMonoIncr(String s) {
        int onecount=0 ,result=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') result=Math.min(onecount,result+1);
            else 
                onecount++;
        }
        return result;
    }
}