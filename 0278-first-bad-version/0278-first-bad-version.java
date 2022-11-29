/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first=0,second=n,mid=0;
        while(first<second){
            mid=first+(second-first)/2;
            if(isBadVersion(mid))
                second=mid;
            else
                first=mid+1;
            
        }
        return first;
    }
}