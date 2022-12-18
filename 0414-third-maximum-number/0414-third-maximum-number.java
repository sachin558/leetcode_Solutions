class Solution {
       public static int thirdMax(int[] arr) {
Arrays.sort(arr);

        int k=arr[arr.length-1];
        int count = 1;

            for(int i=arr.length-1;i>=0;i--){

                if(i<arr.length-1 && arr[i] != arr[i+1]){
                    k=arr[i];
                    count++;
                    if(count>=3){
                        return k;
                    }
                }
            }

        return arr[arr.length-1];
    }
}