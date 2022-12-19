class Solution {
       public static int thirdMax(int[] nums) {
          HashSet<Integer> h1 = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            h1.add(nums[i]);
        }
        int j=0;
        int []arr= new int[h1.size()];
        
        for(int val: h1)
        {
          
            arr[j]=val;
            j++;
        }
        Arrays.sort(arr);
     
        if(arr.length==1)
        {
            return arr[0];
        }
        if(arr.length<=2)
        {
            return (arr[arr.length-1]);
        }
        if  (arr.length==3)
            return arr[0];
        else
        {
            return (arr[(arr.length)-3]);
      }    
    }
}