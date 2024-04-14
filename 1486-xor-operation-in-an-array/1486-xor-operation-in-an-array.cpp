class Solution {
public:
    int xorOperation(int n, int start) {
        int ans= 0;
        
        int i= 0;
        while(i < n){
            int x= start+ 2*i;
            ans= ans ^ x;
            i++;
        }
        return ans;
        
    }
};