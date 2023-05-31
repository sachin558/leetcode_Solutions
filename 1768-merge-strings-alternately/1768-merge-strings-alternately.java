class Solution {
    public String mergeAlternately(String word1, String word2) {
       int len1=word1.length();
        int len2=word2.length();
        int i=0,j=0;
        String ans=new String();
        while(i<len1||j<len2){
            if(i<len1) ans+=word1.charAt(i++);
            if(j<len2) ans+=word2.charAt(j++);
        }
        return ans;
    }
}