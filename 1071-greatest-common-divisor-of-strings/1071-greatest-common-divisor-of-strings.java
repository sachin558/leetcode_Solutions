class Solution {
    public String gcdOfStrings(String str1, String str2) {
     if(!(str1+str2).equals(str2+str1)){
         return "";
     }
        int l1=str1.length();
        int l2=str2.length();
        while(l1!=l2){
            if(l1>l2) l1-=l2;
            else l2-=l1;
        }
        return str1.substring(0,l1);
    }
}