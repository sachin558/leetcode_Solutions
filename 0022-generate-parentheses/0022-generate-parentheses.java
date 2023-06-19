class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        tracking("",0,0,res,n);
        return res;
    }
    public void tracking(String curr , int op, int cl, List<String> res,int  n){
        if(curr.length() == 2*n){
            res.add(curr);
            return ;
        }
        if(op<n){
            tracking(curr+"(", op+1,cl,res,n);
        }
        if(cl<op){
            tracking(curr+")", op,cl+1,res,n);
        }

    }
}