class Solution {
    public int myAtoi(String s) {
       s = s.trim();
		if (s.length() < 1)
			return 0;

		int sign = 1;
		int i =0;
		if(s.charAt(0) == '-') {
			sign = -1;
			i = 1;
		} else if(s.charAt(0) == '+') {
			i = 1;
		}
		int ans = 0;
		for (; i < s.length(); i++) {
			int num = s.charAt(i) - 48;

			if ((num >= 0 && num <= 9)) {
				if (sign > 0) {
					if (ans <= Integer.MAX_VALUE / 10 
                        && ((ans * 10) < Integer.MAX_VALUE - num)) {
							ans = ans * 10 + num;
					} else {
						return Integer.MAX_VALUE;
					}
				}

				if (sign < 0) {
					if (ans * sign >= Integer.MIN_VALUE / 10
                        && ((ans * 10) * sign > Integer.MIN_VALUE + num)) {
							ans = ans * 10 + num;
					} else {
						return Integer.MIN_VALUE;
					}
				}

			} else {
				break;
			}
		}
		return ans * sign;
    }
}