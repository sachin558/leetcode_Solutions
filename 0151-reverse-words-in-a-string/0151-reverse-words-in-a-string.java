class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String  rev="";
        String []arr=s.split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            if(i==0)
                rev+=arr[i];
            else 
                rev+=arr[i]+" ";
        }
        return rev;
    }
}