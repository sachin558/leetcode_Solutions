class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String str="";
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length()-1;j>=0;j--){
                str+=arr[i].charAt(j);
            }
            if(i!=arr.length-1)
            str+=" ";
        }
        return str;
    }
}