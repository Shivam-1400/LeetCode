class Solution {
    public boolean canSortArray(int[] nums) {
        int prv = 0, currMin = 0, currMax = 0;
        int previousBitCount = 0;
        
        for (int num : nums) {
            int currentBitCount = Integer.bitCount(num);    
            if (previousBitCount == currentBitCount) {
                currMin = Math.min(currMin, num);
                currMax = Math.max(currMax, num);
            } else if (currMin < prv) {
                return false;
            } else {
                prv = currMax;
                currMin = currMax = num;
                previousBitCount = currentBitCount;
            }
        }
        return currMin >= prv;
    }
}