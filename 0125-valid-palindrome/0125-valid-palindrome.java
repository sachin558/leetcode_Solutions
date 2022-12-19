class Solution {
    public boolean isPalindrome(String s) {
          s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
          int j = s.length() - 1,i=0;
          while(i <= j) {
             if (s.charAt(i) != s.charAt(j)) {
                 return false;
            }
            i++;
            j--;
        }
        return true;
        }
    }
