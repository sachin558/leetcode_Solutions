class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       int left=0,right=letters.length-1,ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(letters[mid]<=target)
                left=mid+1;
            else{
                ans=mid;
                right=mid-1;
            }
        
        }
        return letters[ans];
    }
}