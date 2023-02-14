class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
    int len1= a.length()-1, len2 = b.length()-1, carry=0;
        while(len1 >= 0 || len2 >= 0 || carry==1){
            int sum=carry;
            if(len1 >= 0){
                sum += a.charAt(len1) - '0';
                len1--;
            }
            if(len2 >= 0){
                sum+=b.charAt(len2) - '0';
                len2--;
            }
            ans.append(sum%2);
            carry = sum/2;
        }
        return ans.reverse().toString();
    }

    
}