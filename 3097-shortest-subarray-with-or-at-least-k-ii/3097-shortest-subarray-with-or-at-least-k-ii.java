class Solution {  
    public int minimumSubarrayLength(int[] nums, int k) {  
        int l = 0, r = 0, n = nums.length, ans = Integer.MAX_VALUE;  
        int[] freq = new int[32];  

        while (r < n) {  
            if (convertToNum(freq) < k) {  
                update(freq, nums[r], 1);  
            }  

            while (l <= r && convertToNum(freq) >= k) {  
                ans = Math.min(ans, r - l + 1);  
                update(freq, nums[l], -1);  
                l++;  
            }  

            r++;  
        }  

        return ans == Integer.MAX_VALUE ? -1 : ans;  
    }  

    private void update(int[] freq, int num, int delta) {  
        int[] bits = convert(num);  
        for (int i = 0; i < 32; i++) {  
            freq[i] += bits[i] * delta;  
        }  
    }  

    private int[] convert(int num) {  
        int[] bits = new int[32];  
        for (int i = 0; i < 32; i++) {  
            bits[i] = (num >> i) & 1;  
        }  
        return bits;  
    }  

    private int convertToNum(int[] freq) {  
        int result = 0;  
        for (int i = 0; i < 32; i++) {  
            if (freq[i] > 0) {  
                result |= (1 << i);  
            }  
        }  
        return result;  
    }  
}