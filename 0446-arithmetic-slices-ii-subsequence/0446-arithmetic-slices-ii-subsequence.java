class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int result = 0;
        //Initiliaze an array of HashMap
        HashMap<Integer,Integer>[]maps= new HashMap[nums.length];

       //Iterate through each element of the array
        for(int i=0;i<nums.length;i++){
            maps[i]=new HashMap<>();
            int num=nums[i];
            for(int j=0;j<i;j++){
                if((long)num-nums[j]>Integer.MAX_VALUE)continue;
                if((long)num-nums[j]<Integer.MIN_VALUE)continue;
                int diff = num-nums[j];

          //Update count for the current diff in the HashMap for the current element A[i]
                int count =maps[j].getOrDefault(diff,0);
                maps[i].put(diff,maps[i].getOrDefault(diff,0)+(count+1));
                result+=count;
            
            }
            System.out.println(maps[i]+" "+i);
        }
        return result;
    }
}

