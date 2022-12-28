class Solution {
    public int minStoneSum(int[] piles, int k) {
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int ans=0;
        for(int t:piles){
            pq.add(t);
        }
        while(k-->0){
           int p= pq.poll();
            pq.add(p-p/2);
        }
       while(!pq.isEmpty()){
           ans+=pq.poll();
       }
        return ans;
    }
}