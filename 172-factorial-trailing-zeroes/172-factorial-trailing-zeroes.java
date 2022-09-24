class Solution
{
    public int trailingZeroes(int n)
    {
        return n<5 ? 0 : (int)Math.ceil(n/5) + trailingZeroes((int)Math.ceil(n/5));
    }

    
    
}