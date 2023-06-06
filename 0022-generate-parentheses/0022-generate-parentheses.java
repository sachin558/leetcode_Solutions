class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> ans=new ArrayList<>();
        back("",0,0,ans,n);
        return ans;
    }
    public void back(String curr,int op, int cl , List<String > ans, int n){
        if(curr.length() ==2*n){
            ans.add(curr);
            return ;
        }
        if(op<n){
            back(curr+"(",op+1,cl,ans,n);
        }
        if(cl<op){
            back(curr+")",op,cl+1,ans,n);
        }
    }
}