class Solution {
    public double average(int[] salary) {
        int minsalary=Integer.MAX_VALUE;
        int maxsalary=Integer.MIN_VALUE;
        double sum=0;
        for(int  i=0;i<=salary.length-1;i++){
            minsalary=Math.min(minsalary,salary[i]);
            maxsalary=Math.max(maxsalary,salary[i]);
        }
        for(int i=0;i<=salary.length-1;i++){
            if(minsalary!=salary[i]&&maxsalary!=salary[i]){
                sum+=salary[i];
            }
        }
        return sum/(salary.length-2);
    }
}