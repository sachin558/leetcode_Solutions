class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       int[] a=new int[A.length],b=new int[a.length+1];
        int c=0;
        for(int i=0;i<a.length;i++){
            if(++b[A[i]]==2) c++;
            if(++b[B[i]]==2) c++;
            a[i]=c;
        }
        return a;
    }
}