class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> ans = new ArrayList();
        back("",0,0,ans,n);

        return ans;
    }

    void back(String current,int op , int cl , List<String> ans, int n){
        if(current.length()==2*n){
            ans.add(current);
            return;
        }
        if(op<n)
        back(current+"(", op+1,cl,ans,n);
        if(cl<op)
        back(current+")",op,cl+1,ans,n);
    }
}