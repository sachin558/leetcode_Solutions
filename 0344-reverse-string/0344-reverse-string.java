class Solution {
    public void reverseString(char[] s) {
        int slow=0; int fast=s.length-1;
        while(slow<fast){
            char s1=s[slow];
            s[slow++]=s[fast];
            s[fast--]=s1;
        }
        }
    }
